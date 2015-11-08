package com.rsubramanian.os.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(value = "/index")
	public IndexResponse getIndexResponse() {
		return new IndexResponse("Raj", "Subramanian");
	}

	private static class IndexResponse {

		private String firstName;

		private String lastName;

		public IndexResponse(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	}
}
