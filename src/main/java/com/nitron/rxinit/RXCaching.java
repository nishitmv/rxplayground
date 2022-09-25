package com.nitron.rxinit;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class RXCaching {

	public static void main(String[] args) throws InterruptedException {
		
		Observable<Long> seconds2 =Observable.interval(1, TimeUnit.SECONDS).cache().replay().autoConnect();
				
				seconds2.subscribe(val ->System.out.println("Sub new 1 "+val));
		Thread.sleep(4000);
		
		seconds2.subscribe(val ->System.out.println("Sub new 2 "+val));
		
		Thread.sleep(10000);		

	}

}
