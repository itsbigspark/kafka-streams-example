package dev.bigspark.kafka.model;

public class PayClickEvent {
    private long payDeliveryId;

    private long timestamp;

    @Override
    public String toString() {
        return "payClickEvent{" +
                "payDeliveryId=" + payDeliveryId +
                ", timestamp=" + timestamp +
                '}';
    }

    public long getPayDeliveryId() {
        return payDeliveryId;
    }

    public void setPayDeliveryId(long payDeliveryId) {
        this.payDeliveryId = payDeliveryId;
    }


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
