package observer.simple;

import java.util.*;

public class SimpleSubject implements Subject {
	private List<observer.simple.Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<observer.simple.Observer>();
	}
	
	public void registerObserver(observer.simple.Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(observer.simple.Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}