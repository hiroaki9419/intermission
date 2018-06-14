package com.homepage.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Members {
	private String id;
	private String password;
	private String email;
	private String pic;
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd(E)")
	private Date regDate = new Date();
	private String confirmKey;
	private String confirmStatus;

	public Members(String id, String password, String email, String pic, Date regDate, String confirmKey,
			String confirmStatus) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.pic = pic;
		this.regDate = regDate;
		this.confirmKey = confirmKey;
		this.confirmStatus = confirmStatus;
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

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getConfirmKey() {
		return confirmKey;
	}

	public void setConfirmKey(String confirmKey) {
		this.confirmKey = confirmKey;
	}

	public String getConfirmStatus() {
		return confirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confirmKey == null) ? 0 : confirmKey.hashCode());
		result = prime * result + ((confirmStatus == null) ? 0 : confirmStatus.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Members other = (Members) obj;
		if (confirmKey == null) {
			if (other.confirmKey != null)
				return false;
		} else if (!confirmKey.equals(other.confirmKey))
			return false;
		if (confirmStatus == null) {
			if (other.confirmStatus != null)
				return false;
		} else if (!confirmStatus.equals(other.confirmStatus))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (regDate == null) {
			if (other.regDate != null)
				return false;
		} else if (!regDate.equals(other.regDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", email=" + email + ", pic=" + pic + ", regDate="
				+ regDate + ", confirmKey=" + confirmKey + ", confirmStatus=" + confirmStatus + "]";
	}

}
