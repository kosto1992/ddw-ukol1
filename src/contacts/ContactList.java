package contacts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContactList {
	ArrayList<String> emails = new ArrayList<String>();
	ArrayList<String> phones = new ArrayList<String>();

	public boolean newEmail(String email) {
		return emails.add(email);
	}

	public boolean newPhone(String phone) {
		return phones.add(phone);
	}

	public String getEmails() {
		String ret = "";
		for (int i = 0; i < emails.size(); i++) {
			ret += emails.get(i) + ", ";
		}
		return ret;
	}

	public String getPhones() {
		String ret = "";
		for (int i = 0; i < phones.size(); i++) {
			ret += phones.get(i) + ", ";
		}
		return ret;
	}
	
	public void generateCsvFileForEmails(String sFileName)
	{
		try
		{
		    FileWriter writer = new FileWriter(sFileName);
	 
		    for(int i=0; i<emails.size(); i++){
		    writer.append(emails.get(i));
		    writer.append('\n');
		    }
		    
		    writer.flush();
		    writer.close();
		}
		catch(IOException e)
		{
		     e.printStackTrace();
		} 
	}
	
	public void generateCsvFileForPhones(String sFileName)
	{
		try
		{
		    FileWriter writer = new FileWriter(sFileName);
	 
		    for(int i=0; i<phones.size(); i++){
		    writer.append(phones.get(i));
		    writer.append('\n');
		    }
		    
		    writer.flush();
		    writer.close();
		}
		catch(IOException e)
		{
		     e.printStackTrace();
		} 
	}
}
