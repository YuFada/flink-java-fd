package com.alibaba.job.bean;

import org.apache.flink.streaming.runtime.io.StreamTaskInput;

/**
 * @author fada.yu
 * @date 2020/10/21 10:00
 * @Description：
 */
public class OrderEvent {
    private Long orderId;
    private String eventType;
    private String txId;
    private Long eventTime;


    public OrderEvent(Long orderId, String eventType, String txId, Long eventTime) {
        this.orderId = orderId;
        this.eventType = eventType;
        this.txId = txId;
        this.eventTime = eventTime;
    }

    public OrderEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "orderId=" + orderId +
                ", eventType='" + eventType + '\'' +
                ", txId='" + txId + '\'' +
                ", eventTime=" + eventTime +
                '}';
    }
}
