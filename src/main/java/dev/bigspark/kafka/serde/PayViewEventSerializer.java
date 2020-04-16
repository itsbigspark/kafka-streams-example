package dev.bigspark.kafka.serde;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bigspark.kafka.model.PayViewEvent;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class PayViewEventSerializer implements Serializer<PayViewEvent> {

    private ObjectMapper mapper = new ObjectMapper();

    public void configure(Map<String, ?> map, boolean b) {
    }

    public byte[] serialize(String s, PayViewEvent payViewEvent) {
        try {
            return mapper.writeValueAsBytes(payViewEvent);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {

    }
}
