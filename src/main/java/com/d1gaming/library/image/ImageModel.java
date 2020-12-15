package com.d1gaming.library.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ImageModel {

	@JsonProperty
	private String imageName;
	
	@JsonProperty
	private String imageType;
	
	@JsonProperty
	private byte[] imageByte;

	public ImageModel() {
		
	}
	
	public ImageModel(String imageName, String imageType, byte[] imageByte) {
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageByte = imageByte;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public byte[] getImageByte() {
		return imageByte;
	}

	public void setImageByte(byte[] imageByte) {
		this.imageByte = imageByte;
	}
	
	

}
