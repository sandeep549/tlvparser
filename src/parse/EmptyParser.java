package parse;

import input.Tlv;

class EmptyParser implements TlvParser {

	public static final String KEY = "invalid";
	
	@Override
	public ParsedTlv parse(Tlv tlv) {
		System.out.println("Type not valid");
		return null;
	}
}
