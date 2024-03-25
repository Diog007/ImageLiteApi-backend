package io.github.imageapi.domain.enums;

import lombok.Getter;
import org.springframework.http.MediaType;

import java.util.Arrays;

public enum ImageExtension {
    PNG(MediaType.IMAGE_PNG),
    GIF(MediaType.IMAGE_GIF),
    JPEG(MediaType.IMAGE_JPEG);

    @Getter
    private  MediaType mediaTypeInst;

    ImageExtension(MediaType mediaType){
        this.mediaTypeInst = mediaType;
    }

    public static ImageExtension valueOf(MediaType mediaType){
        return Arrays.stream(values())
                        .filter(ie -> ie.mediaTypeInst.equals(mediaType))
                        .findFirst()
                        .orElse(null);
    }
}
