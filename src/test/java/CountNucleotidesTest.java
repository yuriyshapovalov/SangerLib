package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.Dna;

public class CountNucleotidesTest {

	@Test
	public void ShouldCountAdenineInDna() {
		Dna dna = new Dna("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC");
		long adenine = dna.getAdenineCount();
		long cytosine = dna.getCytosineCount();
		long guanine = dna.getGuanineCount();
		long thymine = dna.getThymineCount();
		
		assertEquals(20, adenine);
		assertEquals(12, cytosine);
		assertEquals(17, guanine);
		assertEquals(21, thymine);
		
		// System.out.format("%s %s %s %s", adenine, cytosine, guanine, thymine);
	}

}
