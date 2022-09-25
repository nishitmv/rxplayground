package com.nitron.rxinit;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class MultiCastingHotObs {

	public static void main(String[] args) throws InterruptedException {
		
		Observable<Integer> obs = Observable.range(1, 3).map(i-> i+5).publish().autoConnect(2);
		obs.subscribe(i-> System.out.println("OBS 1 "+i));
		obs.subscribe(i-> System.out.println("OBS 2 "+i));
		
		
Observable<Long> seconds2 =Observable.interval(1, TimeUnit.SECONDS).publish().refCount(); //.publish().refcount() == share()
		
		seconds2.take(4).subscribe(val ->System.out.println("Sub new 1 "+val));
		Thread.sleep(4000);
		seconds2.subscribe(val ->System.out.println("Sub new 2 "+val));
		
		Thread.sleep(10000);
		
		Observable<Long> seconds =Observable.interval(1, TimeUnit.SECONDS).replay(4).autoConnect();
		
		seconds.subscribe(val ->System.out.println("Sub 1 "+val));
		Thread.sleep(4000);
		seconds.subscribe(val ->System.out.println("Sub 2 "+val));

		
		Thread.sleep(10000);

	}	
	
}
