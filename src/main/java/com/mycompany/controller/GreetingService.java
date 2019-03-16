package com.mycompany.controller;

import com.mycompany.model.Greeting;

public interface GreetingService {
	Greeting generateMessage(String name);
}
