package it.unical.ingsw2018.IntermediateTest_B;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String nome;
	
	private List<Exam> carrier;

	public Student(String nome) {
		this.nome = nome;
		carrier = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Exam> getCarrier() {
		return carrier;
	}

	
	public void registerExam(Exam exam) throws Exception 
	{
		if (carrier.isEmpty())
		{
			carrier.add(exam); 
			return ; 
		}
		for (Exam currentExam : carrier) {
			System.out.println(currentExam.getName() + " " + exam.getName() );
			if ((currentExam.getName()).equals(exam.getName()))
			{
				throw new IndexOutOfBoundsException() ;
			}
		}
		carrier.add(exam); 
	}
	
	public int getCreditSum() {
		int sum = 0 ; 
		for (Exam exam : carrier) {
			sum += exam.getGrade() ; 
		}
		return sum  ;
	}
	
	public double getWeightedSum() {
		int value = 0 ; 
		for (Exam exam : carrier) {
			value += (exam.getCfu()*exam.getGrade()) ;
		}
		int valorePesi = 0 ; 
		
		for (Exam exam : carrier) {
			valorePesi += exam.getCfu() ; 
		}
		 
		return value/valorePesi ; 
	}
	
	
	public static void main(String[] args) throws Exception  {
		Student s = new  Student("studente") ; 
		Exam e1 = new  Exam("nome", 30, 2) ;
		Exam e2 = new  Exam("nome2", 30, 2) ;
		s.registerExam(e1);
		s.registerExam(e2);
	}
}
