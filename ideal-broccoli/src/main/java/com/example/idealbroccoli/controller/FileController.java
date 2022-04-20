package com.example.idealbroccoli.controller;

import com.example.idealbroccoli.payload.FileUploadResponse;
import com.example.idealbroccoli.payload.UniversalResponse;
import com.example.idealbroccoli.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/file")
public class FileController {

    @Autowired
    FileService fileService;

    @PostMapping
    public ResponseEntity<UniversalResponse<FileUploadResponse>> uploadFile(
            @RequestParam("file") MultipartFile file) {
        return null;
    }
}
