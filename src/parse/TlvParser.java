package parse;

import input.Tlv;

public interface TlvParser {
	ParsedTlv parse(Tlv tlv);
}
