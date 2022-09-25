package com.nitron.rxinit;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RXAMBAndZip {

	public static void main(String[] args) throws InterruptedException {

		Observable<String> observable = Observable.just("alpha", "beta", "delta", "gamma");
		Observable<String> observable4 = Observable.just( "delta", "zeta");
		
		Observable.zip(observable, observable4, (a,b)->a+"-"+b).subscribe(System.out::println);;
		
		Observable<Long> observable1 = Observable.interval(1, TimeUnit.SECONDS);
		Observable<Long> observable2 = Observable.interval(300, TimeUnit.MILLISECONDS);
		Observable.ambArray(observable1, observable2)
		
		.subscribe(System.out::println);
		Thread.sleep(5000);
		
		Observable.combineLatest(observable1, observable2, (a,b)->"Source1 "+a+" - Source2 "+b).subscribe(System.out::println);
		Thread.sleep(10000);
		
		observable1.withLatestFrom(observable2, (a,b)->"Source1 "+a+" - Source2 "+b).subscribe(System.out::println);
		Thread.sleep(10000);
		
	}
	
}
