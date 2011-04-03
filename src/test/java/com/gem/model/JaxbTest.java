package com.gem.model;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXB;
import javax.xml.parsers.ParserConfigurationException;

import junit.framework.TestCase;

public class JaxbTest extends TestCase {
	
	public void testColourMarshalling() throws ParserConfigurationException {
		Colour colour = new Colour();
		colour.setId(0);
		colour.setName("Yellow");
		colour.setWowheadId(134);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		JAXB.marshal(colour, baos);
		
		System.out.println(baos.toString());
		
	}
	
	public void testColourUnmarshalling() {
		InputStream xml = getClass().getResourceAsStream("./xml/gem-example-01.xml");
		Colour yellow = JAXB.unmarshal(xml, Colour.class);
		assertEquals(134, yellow.getWowheadId());
		assertEquals("Yellow", yellow.getName());
		
	}

}
