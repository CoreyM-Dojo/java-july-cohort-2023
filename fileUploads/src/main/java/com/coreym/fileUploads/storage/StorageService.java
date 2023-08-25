package com.coreym.fileUploads.storage;

import java.util.Set;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface StorageService {
	
	void init();
	
	void store(MultipartFile file);
	
	Set<String> loadAll();
}
