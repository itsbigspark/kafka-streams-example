package dev.bigspark.kafka.serde;
import dev.bigspark.kafka.model.PayViewEvent;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PayViewEventSerde implements Serde<PayViewEvent> {
    public void configure(Map<String, ?> map, boolean b) {

    }

    public void close() {

    }

    public Serializer<PayViewEvent> serializer() {
        return new PayViewEventSerializer();
    }

    public Deserializer<PayViewEvent> deserializer() {
        return new PayViewEventDeserializer();
    }
}
