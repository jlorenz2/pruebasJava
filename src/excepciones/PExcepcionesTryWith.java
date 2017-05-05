package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class PExcepcionesTryWith {
	public static void main(String[] args)
	{
	   try (BufferedReader reader = new BufferedReader(
	   	new InputStreamReader(
	   	new URL("http://www.yoursimpledate.server/").openStream())))
	   {
	   	String line = reader.readLine();
	   	SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
	   	Date date = format.parse(line);
	   } catch (ParseException | IOException exception) {
	   	// handle I/O problems.
	   }
	}
}