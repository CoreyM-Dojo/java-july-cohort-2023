package com.coreym.fileUploads.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
	
	String location = "src/main/webapp/uploads";
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String loc) {
		this.location = loc;
	}

}
