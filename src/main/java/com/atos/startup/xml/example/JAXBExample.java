package com.atos.startup.xml.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.atos.startup.model.Colour;
import com.atos.startup.model.Money;

public class JAXBExample {

	public static void main(String[] args) {
		
		
		PlayerXmlExample player = new PlayerXmlExample();
		player.setId(100);
		player.setName("mykong");
		player.setColour(Colour.RED);
		player.setMoney(new Money());
		
		try {
			
			File file = new File("/home/mariusz/file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PlayerXmlExample.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(player, file);
			jaxbMarshaller.marshal(player, System.out);
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
