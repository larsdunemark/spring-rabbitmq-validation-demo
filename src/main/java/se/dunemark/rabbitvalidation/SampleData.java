package se.dunemark.rabbitvalidation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record SampleData(
        @Min(1)
        @Max(20)
        Integer num,
        @NotBlank
        String test) {
}
