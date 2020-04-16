package dev.bigspark.kafka;

import dev.bigspark.kafka.model.PayClickAndViewEvent;
import dev.bigspark.kafka.model.PayClickEvent;
import dev.bigspark.kafka.model.PayViewEvent;
import dev.bigspark.kafka.serde.PaySerdes;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.JoinWindows;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;

import java.util.Properties;
import java.util.UUID;

public class InnerWindowedJoinStream {

    public static void main(String[] args) {
        new StreamRuntime("innerWindowedJoin5000ms" + UUID.randomUUID(), 0, 0).run((viewTopic, clickTopic, builder) -> {

            KStream<Long, PayViewEvent> viewStream = builder.stream(Serdes.Long(), PaySerdes.PAY_VIEW_SERDE, viewTopic);
            KStream<Long, PayClickEvent> clickStream = builder.stream(Serdes.Long(), PaySerdes.PAY_CLICK_SERDE, clickTopic);
            KStream<Long, PayClickAndViewEvent> innerJoin = viewStream.join(clickStream, (view, click) -> new PayClickAndViewEvent(view, click)
                    , JoinWindows.of(5000), Serdes.Long(), PaySerdes.PAY_VIEW_SERDE, PaySerdes.PAY_CLICK_SERDE);
            innerJoin.print();


        });
    }

}
