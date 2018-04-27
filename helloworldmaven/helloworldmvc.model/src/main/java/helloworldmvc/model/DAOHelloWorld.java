package helloworldmvc.model;

import helloworldmvc.Contract.*;

public class DAOHelloWorld {
	private String FileName = "HelloWorld.txt";
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld() {	
	}
	protected DAOHelloWorld getInstance() {
		return instance;
	}
	protected void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}
	protected String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	protected void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
}