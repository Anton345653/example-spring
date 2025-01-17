package com.department.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentDto {

    private Long id;

    private String name;

    private String adress;

    private LocalDateTime creationDate;

    private LocalDateTime modificationDate;
}
