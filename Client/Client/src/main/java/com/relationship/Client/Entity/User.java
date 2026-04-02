	package com.relationship.Client.Entity;
	
	import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.OneToMany;
	
	@Entity
	public class User {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		String Uname;
		String Umobile;
		String Uemail;
		String Ucity;
		
		@JoinColumn
		@OneToMany
		
		private List<Orders> o;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getU_name() {
			return Uname;
		}

		public void setU_name(String u_name) {
			Uname = u_name;
		}

		public String getU_mobile() {
			return Umobile;
		}

		public void setU_mobile(String u_mobile) {
			Umobile = u_mobile;
		}

		public String getU_email() {
			return Uemail;
		}

		public void setU_email(String u_email) {
			Uemail = u_email;
		}

		public String getU_city() {
			return Ucity;
		}

		public void setU_city(String u_city) {
			Ucity = u_city;
		}

		public List<Orders> getO() {
			return o;
		}
		
		public void setO(List<Orders> o) {
			this.o = o;
		}
		
}