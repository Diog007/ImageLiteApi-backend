package io.github.imageapi.application.users;

import io.github.imageapi.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
