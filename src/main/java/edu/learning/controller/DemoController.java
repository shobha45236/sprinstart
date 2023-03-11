package edu.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	// method = RequestMethod.GET) This process GET is default
	public String demo() {
		return "<body bgcolor='red' text='yellow'><center><h1>I am Amitava</h1></center></body>";
	}

	// @RequestMapping(value = "/second", method = RequestMethod.GET)
	@GetMapping("/second")
	public String demo2() {
		return "<body bgcolor='yellow' text='red'><center><h1>I am Gunjan</h1></center></body>";
	}

	@GetMapping("/week/{name}") // path variable--> http://localhost:10000/week/monday----> name=monday
	public String check(@PathVariable String name) {// name=monday
		if (name.equalsIgnoreCase("sunday"))
			return "<h1>Its a holiday</h1>";
		else
			return "<h4>Its a working day!!!!</h4>";
	}

//	@GetMapping("/fullname")
//	public String createFullName(@RequestParam(name = "name", required = false, defaultValue = "Anurag") String name,
//			@RequestParam(name = "title", required = false, defaultValue = "Mishra") String title) {
//
//		return "<center><h2>My name is " + name + " " + title + "!!!!</h2></center";
//	}
	@GetMapping("/fullname")
	public String createFullName(@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "title") String title) {

		return "<center><h2>My name is " + name + " " + title + "!!!!</h2></center";
	}

}
