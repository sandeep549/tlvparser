package input;

import java.util.Scanner;

import parse.ParsedTlv;
import parse.ParserFactory;
import parse.TlvParser;

class StdinInputHandler implements InputHandler {

	public static final String KEY = "input";

	@Override
	public void handle(String inputType) {
		if (inputType != null && KEY.equals(inputType)) {
			Scanner scanner = new Scanner(System.in);
			TlvParser parser = null;
			while (true) {
				Tlv tlv = new Tlv(scanner.nextLine());
				if (tlv.isValid()) {
					parser = ParserFactory.getParser(tlv.getT());
					ParsedTlv parsedTlv = parser.parse(tlv);
					if(parsedTlv != null) {
						System.out.println(new StringBuilder(parsedTlv.getT()).append("-").append(parsedTlv.getV()));
					}
				} else {
					System.out.println("Invlid TLV");
				}
			}

		} else {
			System.out.println("Please provide some other imput source.");
		}
	}

}
