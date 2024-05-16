package com.oceanrider.back.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class ResponseDTO {
    public ResponseDTO(List<RecordsDTO> records) {
        this.records = records;
    }

    private List<RecordsDTO> records;

    public List<RecordsDTO> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsDTO> records) {
        this.records = records;
    }
}


