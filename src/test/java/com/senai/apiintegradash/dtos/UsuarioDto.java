package com.senai.apiintegradash.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;
public record UsuarioDto(
        @NotBlank String nome,
        @NotBlank @Email(message = "O email deve estar em um formato válido!") String email,
        @NotBlank String senha,
        String telefone,
        @NotNull UUID id_estrategia, UUID id_dev


) {

}
