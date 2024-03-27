package io.github.imageapi.application.images;

import io.github.imageapi.domain.entity.Image;
import io.github.imageapi.domain.enums.ImageExtension;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Component
public class ImagesMapper {

    public Image mapToImage(MultipartFile file, String name, List<String> tags) throws IOException {

        return Image.builder()
                .name(name)
                .tag(String.join(",", tags))
                .size(file.getSize())
                .extension(ImageExtension.valueOf(MediaType.valueOf(file.getContentType())))
                .file(file.getBytes())
                .build();
    }

    public ImageDTO imageToDTO(Image image, String url){
        return ImageDTO.builder()
                .url(url)
                .extension(image.getExtension().name())
                .name(image.getName())
                .size(image.getSize())
                .uploadDate(image.getUploadDate().toLocalDate())
                .build();
    }
}
