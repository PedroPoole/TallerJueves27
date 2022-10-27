package rxJava;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import reactor.core.*;
import reactor.core.publisher.Flux;

public class PedroPooleRxJava {

	public static void main(String[] args) {
		
		Flux.just("Msg1","Msg2","Msg3").subscribe(
				(String o)->{System.out.println(o);},
				(error)->{}
				);
		
		

	}
}
