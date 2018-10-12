package com.atos.startup.xml.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExampleUnmarshal {

	public static void main(String[] args) {
		try {

			File file = new File("/home/mariusz/file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(PlayerXmlExample.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			PlayerXmlExample player = (PlayerXmlExample) jaxbUnmarshaller.unmarshal(file);
			System.out.println(player);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
