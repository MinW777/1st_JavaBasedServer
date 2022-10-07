package com.fadamoney.demo_makeWeb.service.impl;

import org.springframework.stereotype.Service;
import com.fadamoney.demo_makeWeb.entity.Person;
import com.fadamoney.demo_makeWeb.service.interfa.PersonService;


//@Service提供給service使用
//service想使用要用 @Autowired
@Service
public class PersonServiceImp implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		Person per = new Person();
		per.setId(id);
		per.setAge(22);
		per.setCity("Taiwan");
		per.setName("Min");
		System.out.println("haha");
		return per;
	}
	
	public void getAttribute(Person per) {
		System.out.println(per.getId());
		System.out.println(per.getAge());
		System.out.println(per.getCity());
		System.out.println(per.getName());
	}
	
	
	
}
