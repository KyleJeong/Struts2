package sample;

public class HelloAction {
	
	//1
	private String message;
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	//2
	public String execute(){
		message = "World";
		return "success";
	}
}
