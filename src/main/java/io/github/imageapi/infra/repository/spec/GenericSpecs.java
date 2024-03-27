package io.github.imageapi.infra.repository.spec;

import org.springframework.data.jpa.domain.Specification;

public class GenericSpecs {

    private GenericSpecs(){}

    public static <T> Specification<T> conjunction(){
        return (root, q, criteriaBiulder) -> criteriaBiulder.conjunction();
    }
}
