package com.example.sax.read;



import java.util.List;

import com.example.dataprovider.DataProvider;

public class ReadXMLWithSAX {

	public static void main(String[] args) throws Exception {

		String filename = DataProvider.DATADIR + "customers.xml";
		
		SAXCustomerHandler saxHandler = new SAXCustomerHandler();
		List<Customer> list = saxHandler.readDataFromXML(filename);
		for(int i=0; i<10; i++)
		{
			System.out.println(list.get(i));
		}
	}

}
