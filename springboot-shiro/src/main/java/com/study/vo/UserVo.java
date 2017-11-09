package com.study.vo;

import org.springframework.web.multipart.MultipartFile;

import com.study.model.User;

public class UserVo {

	private User user;
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	private MultipartFile file;
}
