package com.url.shortener.dtos;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class ClickEventDTO {
    private LocalDate clickDate;
    private Long count;
}
