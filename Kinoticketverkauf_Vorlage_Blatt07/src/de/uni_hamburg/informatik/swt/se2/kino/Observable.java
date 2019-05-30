package de.uni_hamburg.informatik.swt.se2.kino;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstrakte Klasse observable ermöglicht es...
 * 
 * @author Malte
 * @version 0.01
 */
public abstract class Observable {

	private Set<Observer> _observer;
	
	/**
	 * Konstruktor von Observable
	 */
	public Observable() {
		
		_observer = new HashSet<Observer>();
	}
	/**
	 * Fuegt einen neuen Beobachter zur Menge hinzu.
	 * 
	 * @param observer der zur Menge hinzuzufuegende Beobachter
	 * 
	 * @require observer !=null
	 */
	public void fuegeBeobachterHinzu(Observer observer) {
		
		assert observer != null : "Vorbedingung verletzt: null";
		_observer.add(observer);
	}
	/**
	 * Informiert alle Beobachter über eine Aenderung
	 */
	public void meldeAenderung() {
		
		for(Observer obs : _observer) {
			
			obs.beachteAenderung(this);
		}
	}
}
