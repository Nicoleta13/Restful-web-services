package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {

		return new SomeBean("a", "s", "g");
	}

	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBeans() {

		return Arrays.asList(new SomeBean("a", "s", "g"), new SomeBean("ff", "tt", "rr "));
	}

}
