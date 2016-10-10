package com.dazzle.escort.facility.model;

public class User extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//fields from third part
	private String nickname;
	private String token;
	private String avatarUrl;
	
	//fields from local part
	private String localId;
	private String region;
	private int gender;
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getAvatarUrl() {
		return avatarUrl;
	}
	
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	public String getLocalId() {
		return localId;
	}
	
	public void setLocalId(String localId) {
		this.localId = localId;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public int getGender() {
		return gender;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Super " + super.toString() +" << User [nickname=" + nickname + ", token=" + token + ", avatarUrl=" + avatarUrl + ", localId=" + localId
				+ ", region=" + region + ", gender=" + gender + "]";
	}
	
	
	
}
