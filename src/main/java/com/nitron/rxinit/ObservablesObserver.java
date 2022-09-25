package com.nitron.rxinit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObservablesObserver {

	public static void main(String[] args) {
		
		Observable<String> obs = Observable.just("val1", "val2", "val3");

		Observer<String> observer= new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNext(String t) {
				
				System.out.println(t);
				
			}

			@Override
			public void onError(Throwable e) {
				e.printStackTrace();
				
			}

			@Override
			public void onComplete() {
				System.out.println("Completed");
				
			}
			
		};
		
		obs.subscribe(observer);
		
	}

	
}
