package oop.pack;


public class OOP implements ILights {


	public static void main() {
		
		
		//you're creating tow objects
		//first one is nokia
		GSM nokia = new GSM();
		
		//the second one is iphone
		GSM iphone = new GSM("NO", "IPS", "6 inch", 4000);
		
	}

	@Override
	public String trunOnLights() {
		// TODO Auto-generated method stub
		return "Lights are turned on ";
	}

	@Override
	public String trunOffLights() {
		// TODO Auto-generated method stub
		return "Lights are turned off";
	}
	
	
}
