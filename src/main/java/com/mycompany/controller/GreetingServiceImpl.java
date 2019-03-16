package com.mycompany.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.mycompany.model.Greeting;

@Service
public class GreetingServiceImpl implements GreetingService {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public Greeting generateMessage(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
