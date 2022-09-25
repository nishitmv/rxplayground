package com.nitron.rxinit;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class MaybeObservables {

	public static void main(String[] args) {
		
		//filter operator releases a maybe if its one or 0 items
		
		Observable<Integer> intobservable = Observable.range(2, 10);
		
		MaybeObserver<Integer> maybeObs= new MaybeObserver<Integer>() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(Integer t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				
			}
		};
		

		
		
	}

}
