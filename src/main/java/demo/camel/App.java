package demo.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class App {
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();


		context.addRoutes(new Route());

		context.start();
		ProducerTemplate pt = context.createProducerTemplate();
		pt.sendBody("direct:start","Hello All, this is the content of Body !");

		ConsumerTemplate ct = context.createConsumerTemplate();
		String msg = ct.receiveBody("seda:end",String.class);

		System.out.println("The Message is ->"+ msg);
	}

}
