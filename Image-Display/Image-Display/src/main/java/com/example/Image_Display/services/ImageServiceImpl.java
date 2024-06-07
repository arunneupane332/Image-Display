package com.example.Image_Display.services;

import com.example.Image_Display.Entity.Image;
import com.example.Image_Display.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image saveImage(MultipartFile file)throws IOException, SQLException {
        String fileName = file.getOriginalFilename();
        Blob blob = new SerialBlob(file.getBytes());
        Image image = new Image();
        image.setFile(fileName);
        image.setImageData(blob);
        return imageRepository.save(image);
    }

    @Override
    public Optional<Image> getImage(Long id) {
        return imageRepository.findById(id);
    }
}
