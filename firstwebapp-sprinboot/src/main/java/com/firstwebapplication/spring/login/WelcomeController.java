package com.firstwebapplication.spring.login;



//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.security.core.Authentication;
@Controller
@SessionAttributes("name")
public class WelcomeController {	
	
	//private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "Welcom";
}
	private String getLoggedinUsername(){
	 Authentication authentication = 
			 SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
//localhost:8084/login?name=john