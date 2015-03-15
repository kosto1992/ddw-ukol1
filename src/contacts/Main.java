package contacts;

import gate.util.GateException;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main {
	/**
     * @param args the command line arguments
     * @throws gate.util.GateException
     * @throws java.net.MalformedURLException
     */
	public static void main(String[] args) throws MalformedURLException, GateException {
		String gate="";
		ContactList contacts = new ContactList();
    	GateClient client = new GateClient();        
        try {
			gate = client.run("http://www.splavujeme.sk", contacts);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(gate);
    }
}
