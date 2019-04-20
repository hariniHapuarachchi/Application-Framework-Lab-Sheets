package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;
@RestController 
@RequestMapping(value = "/messages") 
public class MessageController {

	@RequestMapping(method = RequestMethod.POST)
	public Message createMessage(@RequestBody Message message) {
		return null;
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.PUT)
	public Message updateMessage(@PathVariable("id") String id,@RequestBody Message message) {
		return null;
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteMessage(@PathVariable("id") String id) {
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Message> findAllMessages(@RequestBody Message message) {
		return null;
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Message findMessage(@PathVariable("id") String id,@RequestBody Message message) {
		return null;
	}
}
