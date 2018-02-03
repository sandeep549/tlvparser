package parse;

public class ParsedTlv {
	private String T;
	private String V;
	
	public ParsedTlv(String t, String v) {
		this.T = t;
		this.V = v;
	}

	public String getT() {
		return T;
	}

	public String getV() {
		return V;
	}
}
