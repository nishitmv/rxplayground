package com.nitron.rxinit;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class IntervalObservable {

	public static void main(String[] args) throws InterruptedException {
		
		
		Observable.interval(0, 200, TimeUnit.MILLISECONDS).subscribe(System.out::println);
		Thread.sleep(5000);
	}

}
