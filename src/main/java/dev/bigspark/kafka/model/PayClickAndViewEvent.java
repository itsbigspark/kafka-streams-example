package dev.bigspark.kafka.model;

/**
 *  Created by Shaine Ismail
 */
public class PayClickAndViewEvent {
    private PayViewEvent viewEvent;
    private PayClickEvent clickEvent;

    public PayClickAndViewEvent(PayViewEvent viewEvent, PayClickEvent clickEvent) {
        this.viewEvent = viewEvent;
        this.clickEvent = clickEvent;
    }

    public PayClickAndViewEvent(){}

    public PayViewEvent getViewEvent() {
        return viewEvent;
    }

    public void setViewEvent(PayViewEvent viewEvent) {
        this.viewEvent = viewEvent;
    }

    public PayClickEvent getClickEvent() {
        return clickEvent;
    }

    public void setClickEvent(PayClickEvent clickEvent) {
        this.clickEvent = clickEvent;
    }

    public long duration() {
        return clickEvent.getTimestamp() - viewEvent.getTimestamp();
    }

    @Override
    public String toString() {
        return "PayClickAndViewEvent{" +
                "viewEvent=" + viewEvent +
                ", clickEvent=" + clickEvent +
                '}';
    }
}
