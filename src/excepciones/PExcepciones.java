package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   		   	try {
		   		URL url = new URL("http://www.worldtimeserver.com/");
		   		BufferedReader reader = new 
						BufferedReader(new InputStreamReader(url.openStream()));
		   		String line = reader.readLine();
		   		System.out.println("-" + line + "-");
		   		SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
		   		Date date = format.parse(line);
		   	}
		   		   	catch(ParseException | IOException  exception) {
		   		   		System.out.println("Se produjo un error");
		   	}

		   }
		
	}


