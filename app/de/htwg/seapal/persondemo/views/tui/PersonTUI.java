package de.htwg.seapal.persondemo.views.tui;

import java.util.Scanner;

import com.google.inject.Inject;

import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.util.observer.Event;
import de.htwg.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;


public class PersonTUI implements Plugin, IObserver{
	
	private IPersonController controller;

	@Inject
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
			System.out.println("New Person Name:");
			Scanner scanner = new Scanner(System.in);
			controller.setPersonName(scanner.next());
		}
		return continu;
	}
	
	public void printTUI() {
		System.out.println("PersonDemo: n - new Name");
		System.out.println(controller.getString());
		
	}

	@Override
	public String getMenuEntry() {
		return "Person";
	}

	@Override
	public char getMenuKey() {
		return 'p';
	}

}
