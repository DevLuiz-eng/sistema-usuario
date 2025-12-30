package com.luizdev.sistema_usuario.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record UserRequest(@NotNull String name, @NotNull String email, @Min(1) @NotNull int age) {
}
