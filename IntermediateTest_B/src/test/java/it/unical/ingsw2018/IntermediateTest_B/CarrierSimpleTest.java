package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierSimpleTest {

	Student s = new Student ("student") ; 
	
	@Test(expected = IndexOutOfBoundsException.class ) 
	public void registerExamVerify () throws Exception {
		this.s.registerExam(new Exam("exam", 30, 12));
		this.s.registerExam(new Exam("exam", 30, 12));
	}
	
	@Test 
	public void verificaSommaCFU () throws Exception {
		int numerocrediti = 0 ; 
		this.s.registerExam(new Exam("exam", 30, 12));
		this.s.registerExam(new Exam("exam2", 30, 8));
		for (Exam exam : s.getCarrier()) {
			numerocrediti += exam.getCfu() ; 
		}
		assertEquals(numerocrediti, 20);
	}

}
