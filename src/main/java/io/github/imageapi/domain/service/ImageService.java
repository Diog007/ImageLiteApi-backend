package io.github.imageapi.domain.service;

import io.github.imageapi.domain.entity.Image;
import io.github.imageapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {
    Image save(Image image);
    Optional<Image> findById(String id);

    List<Image> search(ImageExtension extension, String query);
}
