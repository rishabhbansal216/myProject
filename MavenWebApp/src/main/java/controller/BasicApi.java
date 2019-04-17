package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class BasicApi {
	@RequestMapping(value="/method",method=RequestMethod.GET)
	@ResponseBody
	public String den(){
		System.out.println("Hello world");
		return "Rishi";
	}
}
