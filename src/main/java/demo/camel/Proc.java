package demo.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.support.DefaultMessage;

import java.sql.SQLOutput;

public class Proc implements Processor {

	public void process(Exchange exchange) throws Exception {

		System.out.println("Inside Producer");
		System.out.println("Ths Exchange Identifir is :" +exchange.getExchangeId());
		System.out.println("Ths Mesage Identifir is : "+ exchange.getMessage().getMessageId());
		exchange.getMessage().setBody(exchange.getMessage().getBody() + "-by Mahendra Nath");
	}

}
