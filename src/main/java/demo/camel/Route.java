package demo.camel;

import org.apache.camel.builder.RouteBuilder;

public class Route extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Camel Route configure Class");
		from("file:input_box?noop=true").to("file:output_box?noop=true");
	}

}
