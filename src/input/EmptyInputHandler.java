package input;

public class EmptyInputHandler implements InputHandler {

	public static final String KEY = "empty";
	
	@Override
	public void handle(String input) {
		System.out.println("No handler assigned for input type " + input);
	}

}
