package com.nitron.rxinit;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TransformOps {

	public static void main(String... strings) throws InterruptedException {

		Observable<String> observable = Observable.just("alpha", "beta", "delta", "gamma", "delta", "zeta");
	
		observable.map(x-> x.length()).forEach(System.out::println);
		System.out.println("===========================================================================");

		observable.startWith(Observable.just("Eenie","meenie","minie","mo")).subscribe(System.out::println);
		System.out.println("===========================================================================");

		Observable.empty().defaultIfEmpty("Someitem").subscribe(System.out::println);
		System.out.println("===========================================================================");

		Observable.empty().switchIfEmpty(observable).subscribe(System.out::println);
		System.out.println("===========================================================================");

		observable.delay(5, TimeUnit.SECONDS).subscribe(System.out::println);
	
		System.out.println("===========================================================================");
		
		observable.sorted((x,y)->{if(x.length()>y.length())return 1; else return -1;} ).subscribe(System.out::println);
		System.out.println("===========================================================================");
		
		observable.sorted(Comparator.reverseOrder()).subscribe(System.out::println);
		
		System.out.println("===========================================================================");

		Observable<Integer> numObs = Observable.range(5, 20);
		
				numObs.scan((x,y)->x+y).subscribe(System.out::println);
		
		System.out.println("===========================================================================");

		
		Thread.sleep(10000);
		
		
		
	}
	
}
