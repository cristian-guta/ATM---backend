package com.test.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResultDTO {
    private String type;
    private String message;
}