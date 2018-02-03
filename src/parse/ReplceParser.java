package parse;

import input.Tlv;

class ReplceParser implements TlvParser {

	public static final String KEY = "REPLCE";
	private static final String REPLACE_WITH = "THIS STRING";
	@Override
	public ParsedTlv parse(Tlv tlv) {
		return new ParsedTlv(tlv.getT(), REPLACE_WITH);
	}

}
