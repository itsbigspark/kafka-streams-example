package dev.bigspark.kafka;

import dev.bigspark.kafka.model.PayClickAndViewEvent;
import dev.bigspark.kafka.model.PayClickEvent;
import dev.bigspark.kafka.model.PayViewEvent;
import dev.bigspark.kafka.serde.PaySerdes;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.kstream.KTable;

import java.util.UUID;

public class InnerJoinTable {
    public static void main(String[] args) {
        new StreamRuntime("innerWindowedJoinTables" + UUID.randomUUID(), 0, 0).run((viewTopic, clickTopic, builder) -> {
            KTable<Long, PayViewEvent> viewStream = builder.table(Serdes.Long(), PaySerdes.PAY_VIEW_SERDE, viewTopic, "Views");
            KTable<Long, PayClickEvent> clickStream = builder.table(Serdes.Long(), PaySerdes.PAY_CLICK_SERDE, clickTopic, "Clicks");
            KTable<Long, PayClickAndViewEvent> innerJoin = viewStream.join(clickStream, (view, click) ->  new PayClickAndViewEvent(view, click));
            innerJoin.print();
        });

    }
}
