package dev.bigspark.kafka.model;

public class PayViewEvent {
    private long payDeliveryId;
    private String payId;
    private long timestamp;

    public long getPayDeliveryId() {
        return payDeliveryId;
    }

    public void setPayDeliveryId(long payDeliveryId) {
        this.payDeliveryId = payDeliveryId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "PayViewEvent{" +
                "PayDeliveryId=" + payDeliveryId +
                ", adId='" + payId + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
