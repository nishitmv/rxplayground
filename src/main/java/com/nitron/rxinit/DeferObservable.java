package com.nitron.rxinit;

import io.reactivex.Observable;

public class DeferObservable {

	
	static int a =1, b=10;
	public static void main(String...strings )
	{
		
		Observable<Integer> intObs = Observable.defer(()->Observable.range(a, b));
		
		 intObs.subscribe(val->System.out.println("Observer 1 "+val));
		
		 b=15;
		 
		 intObs.subscribe(val->System.out.println("Observer 2 "+val));
		 
		 
		 intObs.first(100).subscribe(System.out::println);
		
	}
	
}
