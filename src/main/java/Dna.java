package main.java;

public class Dna {
	private String sequence;

	public Dna(String sequence) {
		if(!isValidSequence(sequence))
			throw new IllegalArgumentException("DNA sequence not valid");
		this.sequence = sequence.toUpperCase();
	}
	
	private final boolean isValidSequence(String seq) {
		if(seq == null || seq.length() < 1) return false;
		for(char nbase : seq.toCharArray()) {
			if(nbase == 'A' 
			|| nbase == 'C'
			|| nbase == 'G'
			|| nbase == 'T')
				continue;
			else
				return false;
		}
		return true;
	}

	public long getAdenineCount() {
		return getCount('A');
	}

	public long getCytosineCount() {
		return getCount('C');
	}

	public long getGuanineCount() {
		return getCount('G');
	}

	public long getThymineCount() {
		return getCount('T');
	}
	
	private long getCount(char nt) {
		int counter = 0;
		for(char nbase : sequence.toCharArray())
			if(nbase == nt) counter++;
		return counter;
	}

	public String transcribeToRna() {
		StringBuilder sb = new StringBuilder(sequence);
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == 'T')
				sb.setCharAt(i, 'U');
		}
		return sb.toString();
	}

}
