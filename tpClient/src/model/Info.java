package model;

public class Info {
	
	private String tel;
	private String email;
		
	public Info() {}

	public Info(String tel, String email) {
		this.tel = tel;
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Info [tel=" + tel + ", email=" + email + "]";
	}
	
}
