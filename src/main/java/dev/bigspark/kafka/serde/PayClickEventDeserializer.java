package dev.bigspark.kafka.serde;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bigspark.kafka.model.PayClickEvent;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class PayClickEventDeserializer implements Deserializer<PayClickEvent> {
    private ObjectMapper mapper = new ObjectMapper();

    public void configure(Map<String, ?> map, boolean b) {
    }

    public PayClickEvent deserialize(String s, byte[] bytes) {
        try {

            return mapper.readValue(bytes, PayClickEvent.class);
        } catch (Exception e) {

            return null;
        }
    }

    public void close() {

    }
}
