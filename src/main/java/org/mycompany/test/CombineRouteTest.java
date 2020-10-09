package org.mycompany.test;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.mycompany.models.Request;
import org.mycompany.models.Responce;

import java.io.InputStream;

public class CombineRouteTest extends CamelSpringTestSupport{

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		// TODO Auto-generated method stub
		return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}
	
	@Test
	public void testPayloadIsReached() 
	   throws InterruptedException, ParseException {
		Request req=new Request();
		req.setFromAccountNumber("AC99898");
		req.setToAccountNumber("AC98989");
		req.setAmount("8900.00");
		req.setCurrencyCode("DOLLER");
		
//		Responce expectedResponce= new Responce();
//		expectedResponce.setFromAccountNumber("AC99898");
//		expectedResponce.setFromBalance("58000.00");
//		expectedResponce.setJournalReferance("JRN9909096680");
//		expectedResponce.setToBalance("9000.00");
		
//		String str="{\n" + 
//				"    \"fromAccountNumber\":\"AC8978977\",\n" + 
//				"    \"toAccountNumber\":\"AC78567857\",\n" + 
//				"    \"fromAmount\":\"29999.00\",\n" + 
//				"    \"toAmount\":\"30.00\",\n" + 
//				"    \"curruncyCode\":\"DOLLER\"\n" + 
//				"}";
//		JSONParser parser = new JSONParser();
//        Object obj = parser.parse(str);
//
//        JSONObject jsonObject = (JSONObject) obj;
        
		
		
	 MockEndpoint mockOut = getMockEndpoint("mock:out");
	 mockOut.setExpectedCount(1);
	 template.sendBody("direct:listnerEndpoint", req);

	 assertMockEndpointsSatisfied();
	}
	

}
