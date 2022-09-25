package com.nitron.rxinit;

import io.reactivex.Observable;

public class Observables {

	public static void main(String[] args) {
		
		
		Observable<String> obs = Observable.create(emitter->{
			
			try {
			emitter.onNext("val1");
			emitter.onNext("val2");
			emitter.onNext("val3");
			
			emitter.onComplete();
			
			}catch(Exception ex)
			{
				emitter.onError(ex);
			}
			
		});

	}

}
