package tlvprocessor;

import input.InputHandler;
import input.InputHandlerFactory;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0) {
			String inputType = args[0];
			InputHandler handler = InputHandlerFactory.get(inputType);
			handler.handle(inputType);
		}else {
			System.out.println("Please specifiy input source");
		}

	}

}
