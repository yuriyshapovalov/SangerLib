package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Dna;

public class ComplementingStrandDNA {

	@Test
	public void ShouldReturnReverseComplement() {
		Dna dna = new Dna("AAAACCCGGT");
		String compl = dna.getReverseComplement();
		assertEquals("ACCGGGTTTT", compl);
		
		// System.out.println(compl);
	}

}
