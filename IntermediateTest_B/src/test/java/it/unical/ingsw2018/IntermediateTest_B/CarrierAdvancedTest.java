package it.unical.ingsw2018.IntermediateTest_B;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrierAdvancedTest {
	
	Student s1 = new Student ("student") ; 
	@Test
	public void verificaMediaPesata () throws Exception 
	{
		this.s1.registerExam(new Exam("exam1", 30, 12));
		this.s1.registerExam(new Exam("exam2", 30, 12));
		this.s1.registerExam(new Exam("exam3", 30, 12));
		System.out.println("calcolo : "+s1.getWeightedSum());
		assertEquals((int)30.0,  (int)s1.getWeightedSum());
	}
}
