package com.dh.testdubbo;

import org.springframework.stereotype.Service;

import com.dh.test.TestService;

@Service("dubbotest")
public class TestServiceImpl implements TestService {

	@Override
	public String test() {
		System.out.println("hello word");
		return "hello world";

	}

}
