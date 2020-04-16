package dev.bigspark.kafka.serde;

import java.util.Map;

import dev.bigspark.kafka.model.PayClickEvent;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class PayClickEventSerde implements Serde<PayClickEvent> {
    public void configure(Map<String, ?> map, boolean b) {

    }

    public void close() {

    }

    public Serializer<PayClickEvent> serializer() {
        return new PayClickEventSerializer();
    }

    public Deserializer<PayClickEvent> deserializer() {
        return new PayClickEventDeserializer();
    }
}
