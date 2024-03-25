package io.github.imageapi.domain.service;

import io.github.imageapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {
    Image save(Image image);
    Optional<Image> findById(String id);
}
