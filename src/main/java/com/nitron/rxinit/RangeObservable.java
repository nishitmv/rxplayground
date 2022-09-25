package com.nitron.rxinit;

import io.reactivex.Observable;

public class RangeObservable {

	public static void main(String[] args) {
	
		Observable.range(0, 10).subscribe(System.out::println);

		Observable.never().subscribe();
		
		Observable.empty();
		
	}

}
