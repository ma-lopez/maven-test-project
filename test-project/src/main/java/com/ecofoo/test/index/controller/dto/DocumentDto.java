package com.ecofoo.test.index.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DocumentDto {
    private String fileName;
    private String endorsement;
}
