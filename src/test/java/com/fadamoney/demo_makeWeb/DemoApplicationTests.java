package com.fadamoney.demo_makeWeb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fadamoney.demo_makeWeb.service.impl.PersonServiceImp;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired //自動new PersonService
	private PersonServiceImp personService;

	@Test
	void wannatry() {
		var per = personService.getPersonInfo("dick");
		personService.getAttribute(per);
	}
	
	@Test
	void contextLoads() {
		System.out.println("hahahahaha");
	}
	
	
}
