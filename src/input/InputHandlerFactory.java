package input;

import java.util.HashMap;

public class InputHandlerFactory {
	private static HashMap<String, InputHandler> map = new HashMap<>();
	static {
		map.put(EmptyInputHandler.KEY, new EmptyInputHandler());
		map.put(StdinInputHandler.KEY, new StdinInputHandler());
	}
	
	public static InputHandler get(String inputType) {
		return ((inputType == null || map.get(inputType) == null) ? map.get(EmptyInputHandler.KEY) : map.get(inputType));
	}
}
