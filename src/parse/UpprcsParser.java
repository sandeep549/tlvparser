package parse;

import input.Tlv;

class UpprcsParser implements TlvParser {

	public static final String KEY = "UPPRCS";
	
	@Override
	public ParsedTlv parse(Tlv tlv) {
		return new ParsedTlv(tlv.getT(), tlv.getV().substring(0, tlv.getL()).toUpperCase());
	}
}
