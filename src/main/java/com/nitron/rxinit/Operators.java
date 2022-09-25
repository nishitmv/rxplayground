package com.nitron.rxinit;

import io.reactivex.Observable;

public class Operators {

	public static void main(String... strings) throws InterruptedException {

		Observable<String> observable = Observable.just("alpha", "beta", "delta", "gamma", "delta", "zeta");

		
		  observable.filter(x-> x.length()>4).forEach(x-> System.out.println(x) );
		  
		  observable.take(2).forEach(System.out::println);
		  
		  observable.first("None").doOnSuccess(System.out::println).subscribe();
		 

		observable.takeWhile(x -> x.length() > 4).forEach(System.out::println);

		observable.skipWhile(x -> x.length() > 4).forEach(System.out::println);

		observable.distinct().subscribe(System.out::println);

	}

}
