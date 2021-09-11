package com.microservices.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataTransfer {
    private List<Object> dataTransfer = new ArrayList<>(0);

    public void addResponse(Object obj){ dataTransfer.add(obj); }

    public List<Object> getDataTransfer() {
        return dataTransfer;
    }

    public void setDataTransfer(List<Object> dataTransfer) {
        this.dataTransfer = dataTransfer;
    }
}
