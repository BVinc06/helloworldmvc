package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import helloworldmvc.Contract.*;

public class DAOHelloWorld {
	private static final String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld() {	
		this.readFile();
	}
	protected static synchronized DAOHelloWorld getInstance() {
		if (instance == null) {
			setInstance(new DAOHelloWorld());
		}
		return instance;
	}
	protected static void setInstance(final DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	public String getHelloWorldMessage() {
        return this.helloWorldMessage;
    }
	 private void setHelloWorldMessage(final String helloWorldMessage) {
	        this.helloWorldMessage = helloWorldMessage;
	    }
	 private void readFile() {
	        BufferedReader buffer;
	        try {
	            buffer = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
	            this.setHelloWorldMessage(buffer.readLine());
	            buffer.close();
	        } catch (final FileNotFoundException exception) {
	            exception.printStackTrace();
	        } catch (final IOException exception) {
	            exception.printStackTrace();
	        }
	    }
	 
}