package de.htwg.seapal.persondemo.views.tui;

import java.util.Scanner;

import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.util.observer.Event;
import de.htwg.util.observer.IObserver;


public class PersonTUI implements IObserver{
	
	private IPersonController controller;

	public PersonTUI(IPersonController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (line.equalsIgnoreCase("n")) {
			Scanner scanner = new Scanner(System.in);
			controller.setPersonName(scanner.next());
		}
		return continu;
	}
	
	public void printTUI() {
		System.out.println("PersonDemo: n - new Name");
		System.out.println(controller.getString());
		
	}

}
