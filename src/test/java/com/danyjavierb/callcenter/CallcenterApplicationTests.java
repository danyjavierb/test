package com.danyjavierb.callcenter;

import com.danyjavierb.callcenter.model.Call;
import com.danyjavierb.callcenter.model.Director;
import com.danyjavierb.callcenter.model.Employee;
import com.danyjavierb.callcenter.model.Operator;
import com.danyjavierb.callcenter.model.Supervisor;
import com.danyjavierb.callcenter.services.Dispatcher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CallcenterApplicationTests {

	@Test
	public void testCallDuration() throws InterruptedException {

		Dispatcher callcenter = new Dispatcher();
		int poolSize = 1;
		callcenter.setPoolSize(poolSize);
		callcenter.start();

		Employee e1 = new Operator(callcenter, "operador 2");

		Call tempCall = new Call("llamada unica");
		callcenter.dispatchCall(tempCall);

		Thread.sleep(tempCall.getDuration());
		Assert.assertTrue(callcenter.getCalls().isEmpty());
	}

	@Test
	public void testCallsWithTwoThreads() throws InterruptedException {

		Dispatcher callcenter = new Dispatcher();
		//realistic approach pool size no way 10 threads predict time
		int poolSize = 2;
		callcenter.setPoolSize(poolSize);
		callcenter.start();

		Employee e2 = new Operator(callcenter, "operador 2");
		Employee e3 = new Supervisor(callcenter, "supervisor 1");
		Employee e4 = new Director(callcenter, "director 1");
		Employee e1 = new Operator(callcenter, "operador 1");
		Employee e5 = new Director(callcenter, "director 2");
		Employee e6 = new Operator(callcenter, "Operator 3");
		Employee e7 = new Operator(callcenter, "Operator 4");
		Employee e8 = new Operator(callcenter, "Operator 5");
		Employee e9 = new Operator(callcenter, "Operator 6");
		Employee e10 = new Operator(callcenter, "Operator 7");


		int callsDuration = 0;
		for (int i = 0; i < 10 ; i++) {
			Call tempCall = new Call("llamada"+i);
			callsDuration =+ tempCall.getDuration();
			callcenter.dispatchCall(tempCall);
		}

		Thread.sleep(callsDuration/poolSize);

		Assert.assertTrue(callcenter.getCalls().isEmpty());
	}


}
