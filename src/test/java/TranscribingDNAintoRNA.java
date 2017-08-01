package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Dna;

public class TranscribingDNAintoRNA {

	@Test
	public void ShouldReturnTranscribedRnaFromDna() {
		Dna dna = new Dna("GATGGAACTTGACTACGTAAATT");
		String rna = dna.transcribeToRna();
		
		assertEquals("GAUGGAACUUGACUACGUAAAUU", rna);
		
		// System.out.format("%s", rna);
	}

}
