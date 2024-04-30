package io.github.imageapi.application.users;

import io.github.imageapi.domain.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToUser(UserDTO dto) {
        return User.builder()
                .email(dto.email())
                .name(dto.name())
                .password(dto.password())
                .build();
    }
}
