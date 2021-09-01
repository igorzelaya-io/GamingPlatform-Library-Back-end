package com.d1gaming.library.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ImageModel {

	@JsonProperty
	private String dtoID;
	
	@JsonProperty
	private String dtoName;
	
	@JsonProperty
	private String imageModelDocumentId;
	
	@JsonProperty
	private String imageBytes;

	public ImageModel() {
		
	}

	public String getDtoID() {
		return dtoID;
	}

	public void setDtoID(String dtoID) {
		this.dtoID = dtoID;
	}

	public String getDtoName() {
		return dtoName;
	}

	public void setDtoName(String dtoName) {
		this.dtoName = dtoName;
	}

	public String getImageModelDocumentId() {
		return imageModelDocumentId;
	}

	public void setImageModelDocumentId(String imageModelDocumentId) {
		this.imageModelDocumentId = imageModelDocumentId;
	}

	public String getImageBytes() {
		return imageBytes;
	}

	public void setImageBytes(String imageBytes) {
		this.imageBytes = imageBytes;
	}
		
}
