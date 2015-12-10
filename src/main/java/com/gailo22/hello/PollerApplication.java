package com.gailo22.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PollerApplication {

  public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("META-INF/spring/integration/delay.xml");
	}

}
