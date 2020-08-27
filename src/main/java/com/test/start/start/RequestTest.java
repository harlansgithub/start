package com.test.start.start;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class RequestTest {
	@Autowired
	private EventBus eventBus;
	@RequestMapping("/hello")
	public void hello(String name){
		eventBus.post(name);
	}
}
