package com.nitron.rxinit;

import io.reactivex.Observable;

public class ActionOps {

	public static void main(String[] args) {
Observable<Integer> numObs = Observable.just(1,3,5,0,7,9);
		
		numObs.doOnNext(i->System.out.println(i+" is coming"))
		.doOnError(err->System.out.println("Exception has Occured  "))
		.doOnComplete(()->System.out.println("Completed !!"))		
		.map(i->5/i)
		.subscribe(System.out::println); 

	}

}
