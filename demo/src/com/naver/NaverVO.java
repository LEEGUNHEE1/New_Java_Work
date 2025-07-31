package com.naver;

public class NaverVO {
	private String id;
	private String password;
	private String email;
	private String name;
	private String birth;
	private String gender;
	private String tell;
	
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
	
		String str;
		
		str = String.format("아이디 : %s\n비밀번호 : %s\n이메일주소 : %s\n이름 : %s\n생년월일 : %s\n성별 : %s\n전화번호 : %s",
				id,password,email,name,birth,gender,tell);
		
		return str;
	}

}