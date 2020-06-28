package com.app.bo;

import java.io.IOException;
import java.util.List;

import com.app.exception.FileNameNotFoundException;
import com.app.model.FileDetail;

public interface FileManagerBO {
	public FileDetail createFile(String name) throws IOException;
	public boolean deleteFile(String name) throws FileNameNotFoundException;
	public List<FileDetail> getAllFiles();
	public boolean searchFile(String name);
}
