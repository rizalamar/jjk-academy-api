package com.jjk.jjkacademyapi.dto;

import com.jjk.jjkacademyapi.model.Sorcerer;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
public class SorcererRequest {
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @Min(value = 1, message = "Age must be at least 1")
    @Max(value = 1000, message = "Age cannot exceed 1000")
    private Integer age;

    private String rank;
    private String cursedTechnique;
    private UUID clanId;

}
