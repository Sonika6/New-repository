package com.firstwebapplication.spring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	@ResponseBody
	@RequestMapping("say-hello")
	public String sayHello() {
		return "hello as a string";
	}
	
	
	@ResponseBody
	@RequestMapping("say-hello-html")
	public String sayHelloHtml() {
		StringBuffer sb= new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first app</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("hello from html");
		sb.append("<html>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
	}
	

	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayhello";
}
}
