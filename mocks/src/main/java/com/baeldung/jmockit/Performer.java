package com.dipu.jmockit;

public class Performer {
	private Collaborator collaborator;
	
	public void perform(Model model){
		boolean value = collaborator.collaborate(model.getInfo());
		collaborator.receive(value);
	}
}
