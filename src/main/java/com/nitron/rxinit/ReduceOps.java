package com.nitron.rxinit;

import java.util.HashMap;
import java.util.HashSet;

import io.reactivex.Observable;

public class ReduceOps {

	public static void main(String... strings) throws InterruptedException {

		Observable<String> observable = Observable.just("alpha", "beta", "delta", "gamma", "delta", "zeta");
		observable.reduce((x,y)-> x+","+y).subscribe(System.out::println);
	
		//all:boolean, any:boolean, count, contains:boolean
		observable.contains("beta").subscribe(System.out::println);
		
		observable.toMap(String::length).subscribe(System.out::println);
		
		observable.toMultimap(String::length).subscribe(System.out::println);
		
		observable.toMultimap(i-> i, i-> i.length()).subscribe(System.out::println);
		
		observable.toMultimap(i-> i, i-> i.length(), HashMap::new).subscribe(System.out::println);

		//tolist, tosortedlist

		// collect to use a ds not specified by observable like tolist and tomap
		observable.collect(HashSet::new, HashSet::add).subscribe(System.out::println); 

		//onErrorReturnItem, onErrorResuleNext
		
		Observable<Integer> numObs = Observable.just(1,3,5,0,7,9);
		
		numObs.map(i->5/i).retry(2).subscribe(System.out::println); 
		
	}
	
	
}
