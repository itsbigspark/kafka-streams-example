package dev.bigspark.kafka.serde;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bigspark.kafka.model.PayClickAndViewEvent;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class PayClickAndViewEventDeserializer implements Deserializer<PayClickAndViewEvent> {
    private ObjectMapper mapper = new ObjectMapper();

    public void configure(Map<String, ?> map, boolean b) {
    }
    public PayClickAndViewEvent deserialize(String s, byte[] bytes) {
        try {
            if(bytes == null || bytes.length == 0){
                return null;
            }
            return mapper.readValue(bytes, PayClickAndViewEvent.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
    }
}
