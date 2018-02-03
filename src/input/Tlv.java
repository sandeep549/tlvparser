package input;

import java.util.regex.PatternSyntaxException;

public class Tlv {
	private String rawtlv;
	private String T;
	private int L;
	private String V;
	private boolean isValid;

	public Tlv(String rawTlv) {
		this.rawtlv = rawTlv;

		// Parse TLV
		try {
			String[] tlvArr = rawtlv.split("-");
			if (tlvArr.length >= 3 && tlvArr[0].length() == 6 && tlvArr[1].length() == 4) {
				try {
					int dataLen = Integer.parseInt(tlvArr[1]);
					T = tlvArr[0];
					L = Integer.parseInt(tlvArr[1]);
					V = tlvArr[2];
					isValid = true;
				} catch (NumberFormatException e) {
					// Silent consume
					e.printStackTrace();
				}
			}
		} catch (PatternSyntaxException e) {
			// consume exception silently
			e.printStackTrace();
		}
	}

	public String getRawtlv() {
		return rawtlv;
	}

	public String getT() {
		return T;
	}

	public int getL() {
		return L;
	}

	public String getV() {
		return V;
	}

	public boolean isValid() {
		return isValid;
	}

}
