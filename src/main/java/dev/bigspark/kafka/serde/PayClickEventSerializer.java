package dev.bigspark.kafka.serde;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bigspark.kafka.model.PayClickEvent;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PayClickEventSerializer implements Serializer<PayClickEvent> {

    private ObjectMapper mapper = new ObjectMapper();

    public void configure(Map<String, ?> map, boolean b) {

    }

    public byte[] serialize(String s, PayClickEvent payClickEvent) {
        try {
            return mapper.writeValueAsBytes(payClickEvent);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {

    }
}
