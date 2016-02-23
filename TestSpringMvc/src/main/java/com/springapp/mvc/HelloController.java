package com.springapp.mvc;

import com.springapp.model.Person;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "你好");
		return "hello";
	}

	@RequestMapping("/person")
	public String toPerson(String name, double age) {
		System.out.println(name + ", " + age);
		return "hello";
	}

	@RequestMapping("/date")
	public String date(Date date) {
		System.out.println(date);
		return "hello";
	}

	@RequestMapping("/show")
	public String showPerson(Map<String, Object> map) {
		Person p = new Person();
		map.put("p", p);
		p.setAge(20);
		p.setName("Lee");
		return "show";
	}

	@RequestMapping(value = "/getPerson", method = RequestMethod.POST)
	public void getPerson(String name, PrintWriter pw) throws Exception{
		String str = "你好," + name;
		pw.write(str);
	}

	@RequestMapping("/name")
	public String sayHello() {
		return "name";
	}

	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}