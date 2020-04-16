package dev.bigspark.kafka.serde;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bigspark.kafka.model.PayViewEvent;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class PayViewEventDeserializer implements Deserializer<PayViewEvent>{
        private ObjectMapper mapper = new ObjectMapper();

        public void configure(Map<String, ?> map, boolean b) {

        }

        public PayViewEvent deserialize(String s, byte[] bytes) {

            try {
                if(bytes == null || bytes.length == 0){
                    return null;
                }
                return mapper.readValue(bytes, PayViewEvent.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {

        }
}
