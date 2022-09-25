package com.nitron.rxinit;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class RXGroupBy {

	public static void main(String[] args) {
	
		
		Observable<String> observable = Observable.just("alpha", "beta", "delta", "gamma", "deal", "zeta", "garages", "buses");
		
		Observable<GroupedObservable<Character, String>> group = observable.groupBy(s-> s.charAt(0));
		group.flatMapSingle(grp->grp.toList()).subscribe(System.out::println);
		
		group.flatMapSingle(grp->grp.reduce("some",(a,b)->a+","+b).map(str-> grp.getKey()+" : "+str)).subscribe(System.out::println);
		
	}

}
