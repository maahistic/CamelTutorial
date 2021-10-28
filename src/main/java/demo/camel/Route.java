package demo.camel;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Camel Route configure Class");
		from("direct:start").process(new Proc()).to("seda:end");

	}

}
