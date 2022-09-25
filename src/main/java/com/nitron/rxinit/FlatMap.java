package com.nitron.rxinit;

import io.reactivex.Observable;

public class FlatMap {

	public static void main(String[] args) {

		Observable<String> observable = Observable.just("alpha", "beta", "delta", "gamma", "delta", "zeta");
		observable.flatMap(s-> Observable.fromArray(s.split("")))
		.subscribe(System.out::println);

	}

}
