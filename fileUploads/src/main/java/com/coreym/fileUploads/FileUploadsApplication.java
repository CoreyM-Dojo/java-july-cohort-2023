package com.coreym.fileUploads;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.coreym.fileUploads.storage.FileSystemUploadService;
import com.coreym.fileUploads.storage.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileUploadsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(FileSystemUploadService storageService) {
		return (args) -> {
			storageService.init();
		};
	}

}
