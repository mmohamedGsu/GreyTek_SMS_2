package shha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MooseMoose
 */

import java.util.HashSet;
import java.util.Set;
import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;

public class Database {
	
	private static final String dataBaseFileLinux = "/tmp/persons.txt";
	private static final String dataBaseFileWindows = "C:\\SMS_2";
	private static String dataBaseFile;
	
	private Set<Person> people;
	
	public Database () {
		readPersonData();
	}
	
	private void readPersonData() 
	{	
		// Figure out windows vs. linux
		if (File.separator.equals("/")) {
			dataBaseFile = dataBaseFileLinux;
		} else {
			dataBaseFile = dataBaseFileWindows;
		}
		
		try {
			
			people = readPersonFile(dataBaseFile);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("ERROR READING FILE. MAKE SURE YOU HAVE THE RIGHT PATH");
		}	
	}
	
	private Set<Person> readPersonFile(String fileName) throws IOException {
		
		String config;
		
                config = FileUtils.readFileToString(new File(fileName));
		Set<Person> records = new HashSet<Person>();
		
		String[] lines = config.split("\n");
		
		for (String line : lines) {
			records.add(new Person(line));
		}
		
		return records;
	}
	
	public Set<Person> getPersonSet() {
		return people;
	}
	
	public Person findPerson(String firstName) throws IOException{
		if (people != null) {
			for (Person p : people) {
				if (p.getFirstName().equals(firstName)) {
					return p;
				}
			}
		}
		throw new IOException("Person not found");
		
	}
	public void addPerson(Person newPerson) throws IOException {
		if (people != null) {
			for (Person p : people) {
				if (p.equals(newPerson)) {
					throw new IOException("Person already exists");
				}
			}
		}
		people.add(newPerson);
		writePersonToFile(newPerson);
	}
	
	public void deletePerson(Person newPerson) throws IOException {
		if (people != null) {
			for (Person p : people) {
				if (p.equals(newPerson)) {
					people.remove(p);
					updatePersonFile();
					break;
				}
			}
		}
	}
	
	private void updatePersonFile() throws IOException {
		if (people != null) {
			FileUtils.deleteQuietly(new File(dataBaseFile));
			for (Person p : people) {
				writePersonToFile(p);
			}
		}
	}
	private void writePersonToFile(Person p) throws IOException {
		FileUtils.write(new File(dataBaseFile), p.toStorageFormat() + "\n", true);
	}
	
	public Integer getPersonCount() {
		if (people != null) {
			return people.size();
		} else {
			return 0;
		}
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

