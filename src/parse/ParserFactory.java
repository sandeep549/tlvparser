package parse;

import java.util.HashMap;

import input.EmptyInputHandler;

public class ParserFactory {

	private static HashMap<String, TlvParser> map = new HashMap<>();
	static {
		map.put(EmptyParser.KEY, new EmptyParser());
		map.put(UpprcsParser.KEY, new UpprcsParser());
		map.put(ReplceParser.KEY, new ReplceParser());
	}
	
	public static TlvParser getParser(String tlvType) {
		return ((tlvType == null || map.get(tlvType) == null) ? map.get(EmptyParser.KEY) : map.get(tlvType));
	}
}
