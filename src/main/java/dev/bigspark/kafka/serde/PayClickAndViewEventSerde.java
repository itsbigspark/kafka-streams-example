package dev.bigspark.kafka.serde;

import dev.bigspark.kafka.model.PayClickAndViewEvent;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PayClickAndViewEventSerde implements Serde<PayClickAndViewEvent> {
    public void configure(Map<String, ?> map, boolean b) {
    }

    public void close() {
    }

    public Serializer<PayClickAndViewEvent> serializer() {
        return new PayClickAndViewEventSerializer();
    }

    public Deserializer<PayClickAndViewEvent> deserializer() {
        return new PayClickAndViewEventDeserializer();
    }
}
