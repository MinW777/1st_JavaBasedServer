package com.fadamoney.demo_makeWeb.service.interfa;

//import package
import com.fadamoney.demo_makeWeb.entity.Person;

public interface PersonService {
	//定義方法 , 概念類似只有宣告變數名稱沒有值。
	public Person getPersonInfo(String id);
//	
//	default Person getPersonInfo2() {
//		return new Person();
//	}


//	public void printPersonAttributes(Person person);
}