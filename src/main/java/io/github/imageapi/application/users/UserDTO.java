package io.github.imageapi.application.users;

public record UserDTO(
        String name,
        String email,
        String password) {
}
