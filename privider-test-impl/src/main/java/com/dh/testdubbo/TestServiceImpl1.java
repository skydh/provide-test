package com.dh.testdubbo;

import org.springframework.stereotype.Service;

import com.dh.test.TestService1;

@Service("dubbotest1")
public class TestServiceImpl1 implements TestService1 {

	@Override
	public String test() {
		System.out.println("hello word");
		return "hello world";

	}

}
