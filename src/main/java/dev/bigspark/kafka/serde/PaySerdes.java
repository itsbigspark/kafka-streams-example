package dev.bigspark.kafka.serde;

public class PaySerdes {
    public static PayViewEventSerde PAY_VIEW_SERDE = new PayViewEventSerde();
    public static PayClickEventSerde PAY_CLICK_SERDE = new PayClickEventSerde();
    public static PayClickAndViewEventSerde PAY_CLICK_VIEW_SERDE = new PayClickAndViewEventSerde();
}
