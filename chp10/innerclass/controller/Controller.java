package chp10.innerclass.controller;
import java.util.*;

public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(eventList.size() > 0) {
			for(Event e : eventList) {
				if(e.ready()) {
					System.out.println(e);
					e.action();
					// remove有问题
//					eventList.remove(e);
				}
			}
		}
	}
}
