package io.github.imageapi.domain.service;

import io.github.imageapi.domain.AccessToken;
import io.github.imageapi.domain.entity.User;

public interface UserService {
    User getByEmail(String email);
    User save (User user);
    AccessToken autheticate(String email, String password);
}
