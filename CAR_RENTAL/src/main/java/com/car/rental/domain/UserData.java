package com.car.rental.domain;

public class UserData {
		private  long id;
		private String name ;
		private String email;
		private String password ;
		private String adress;
		private boolean isBlocked;
		private Role role;
		public UserData() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public UserData(String name, String email, String password, String adress, boolean isBlocked, Role role) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.adress = adress;
			this.isBlocked = isBlocked;
			this.role = role;
		}



		public UserData(long id, String name, String email, String password, String adress, boolean isBlocked,
				Role role) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.adress = adress;
			this.isBlocked = isBlocked;
			this.role = role;
		}



		public long getId() {
			return id;
		}



		public void setId(long id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getAdress() {
			return adress;
		}



		public void setAdress(String adress) {
			this.adress = adress;
		}



		public boolean isBlocked() {
			return isBlocked;
		}



		public void setBlocked(boolean isBlocked) {
			this.isBlocked = isBlocked;
		}



		public Role getRole() {
			return role;
		}



		public void setRole(Role role) {
			this.role = role;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((adress == null) ? 0 : adress.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + (isBlocked ? 1231 : 1237);
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((role == null) ? 0 : role.hashCode());
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
			UserData other = (UserData) obj;
			if (adress == null) {
				if (other.adress != null)
					return false;
			} else if (!adress.equals(other.adress))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (id != other.id)
				return false;
			if (isBlocked != other.isBlocked)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (role != other.role)
				return false;
			return true;
		}



		@Override
		public String toString() {
			return "UserData [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", adress="
					+ adress + ", isBlocked=" + isBlocked + ", role=" + role + "]";
		}
		
		
		
		
}
