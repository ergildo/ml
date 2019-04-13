package com.ecd.mlapi.model;

import java.io.InputStream;

public class FilePicture {
	private InputStream file;
	private String fileName;

	public FilePicture(InputStream file, String fileName) {
		this.file = file;
		this.fileName = fileName;
	}

	public InputStream getFile() {
		return file;
	}

	public String getFileName() {
		return fileName;
	}
}
