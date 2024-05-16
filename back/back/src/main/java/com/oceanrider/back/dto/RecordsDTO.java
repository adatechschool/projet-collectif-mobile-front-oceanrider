package com.oceanrider.back.dto;

import lombok.Getter;
import lombok.Setter;


public class RecordsDTO {
         private String id;
        private String createdTime;
        private FieldDTO fields;

    public RecordsDTO(String id, String createdTime, FieldDTO fields) {
        this.id = id;
        this.createdTime = createdTime;
        this.fields = fields;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public FieldDTO getFields() {
        return fields;
    }

    public void setFields(FieldDTO fields) {
        this.fields = fields;
    }
}

