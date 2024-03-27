package io.github.imageapi.infra.repository.spec;

import io.github.imageapi.domain.entity.Image;
import io.github.imageapi.domain.enums.ImageExtension;
import org.springframework.data.jpa.domain.Specification;

public class ImageSpecs {

    private ImageSpecs(){}

    public static Specification<Image> extensionEqual(ImageExtension extension){
        return (root, q, cb) -> cb.equal(root.get("extension"), extension);
    }

    public static Specification<Image> nameLike (String name){
        return (root, q, cb) -> cb.like(cb.upper(root.get("name")), "%" + name.toUpperCase() + "%");
    }
    public static Specification<Image> tagsLike (String tag){
        return (root, q, cb) -> cb.like(cb.upper(root.get("tag")), "%" + tag.toUpperCase() + "%");
    }

}
