package com.example.Image_Display.Repository;

import com.example.Image_Display.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    Optional<Image> findById(Long id);
}
