package excepciones;

import java.net.*;
import java.io.*;

public class PExcepcion2 {

	public static void main(String[] args) {
		   	try {
		        URL oracle = new URL("http://www.elmundo.es/");
		        BufferedReader in = new BufferedReader(
		        new InputStreamReader(oracle.openStream()));

		        String inputLine;
		        while ((inputLine = in.readLine()) != null)
		            System.out.println(inputLine);
		        in.close();
		    }
		   	catch(Exception exception) {
		   		System.out.println("Error");
	}
		
	}
}

