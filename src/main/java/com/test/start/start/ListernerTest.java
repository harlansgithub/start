package com.test.start.start;

import com.google.common.eventbus.Subscribe;
import org.springframework.stereotype.Component;

@Component
public class ListernerTest {
	@Subscribe
	public void sayName(String name){
		System.out.println(name);
	}
}
