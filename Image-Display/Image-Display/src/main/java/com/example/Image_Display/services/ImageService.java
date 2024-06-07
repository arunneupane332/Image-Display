package com.example.Image_Display.services;


import com.example.Image_Display.Entity.Image;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

@Service
public interface ImageService {

    public Image saveImage(MultipartFile file)throws IOException, SQLException;
    public Optional<Image> getImage(Long id);
}
