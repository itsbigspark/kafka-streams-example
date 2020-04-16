package dev.bigspark.kafka.serde;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bigspark.kafka.model.PayClickAndViewEvent;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PayClickAndViewEventSerializer implements Serializer<PayClickAndViewEvent> {

    private ObjectMapper mapper = new ObjectMapper();

    public void configure(Map<String, ?> map, boolean b) {

    }

    public byte[] serialize(String s, PayClickAndViewEvent event) {
        try {
            return mapper.writeValueAsBytes(event);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {

    }
}
