package com.nitron.rxinit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ConnectableObservble {

public static void main(String[] args) {
		
		Observable<String> obs = Observable.just("val1", "val2", "val3");
		obs.subscribe(System.out::println, Throwable::printStackTrace, ()-> System.out.println("Completed") );		
		obs.subscribe(System.out::println, Throwable::printStackTrace, ()-> System.out.println("Completed") );	
		
		ConnectableObservable<String> hotObs = obs.publish();
		
		hotObs.subscribe(System.out::println, Throwable::printStackTrace, ()-> System.out.println("Completed") );		
		hotObs.subscribe(System.out::println, Throwable::printStackTrace, ()-> System.out.println("Completed") );	
		hotObs.connect();
		
		
}	
	
}
