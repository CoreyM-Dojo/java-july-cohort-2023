package com.coreym.fileUploads;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.coreym.fileUploads.storage.FileSystemUploadService;

@Controller
public class FileUploadController {
	
	private final FileSystemUploadService storageService;
	
	public FileUploadController(FileSystemUploadService service) {
		this.storageService = service;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		
		Set<String> filenames = storageService.loadAll();
		model.addAttribute("images",filenames);
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String uploadFile(@RequestParam("fileUpload") MultipartFile file) {
		storageService.store(file);
		return "redirect:/";
	}

}
