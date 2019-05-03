package com.redde.client.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReddeWebhookNotification {

    public static enum Type {

        OK_STATUS("OK.FIRST.RESPONSE"),
        PENDING_STATUS("PENDING.RESPONSE"),
        PROGRESS_STATUS("PROGRESS.RESPONSE"),
        PAID_STATUS("PAID.RESPONSE"),
        FAILED_STATUS("FAILED.RESPONSE");

        static Map<String, Type> eventTypeMap = new HashMap<String, Type>();
        static {
            for (Type eventType : Type.values()) {
                eventTypeMap.put(eventType.toString(), eventType);
            }
        }

        public static Type getType(String type) {
            return eventTypeMap.get(type);
        }

        private String type;
        Type(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return this.type;
        }
    }

    private String status;
    private Object object;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}