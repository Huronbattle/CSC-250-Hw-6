package HW;
import java.net.URL;
import java.util.Scanner;

public class Driver{
	
	public static void main(String[] args) {

		String y = Driver.getJSON("http://ddragon.leagueoflegends.com/cdn/11.3.1/data/en_US/champion.json");
		System.out.println(y);
		}
	
	public static String getJSON(String x){	    
		
		String api = "";
		try
		{
			URL u = new URL(x);
		    Scanner input = new Scanner(u.openStream());
		    while (input.hasNext())
		    {api += input.nextLine();}
		    input.close();
		}
		
		
	    catch(Exception e)
		{
	    	e.printStackTrace();
	    	api = "Can't Connect";
		}
		
		return api;
}}
