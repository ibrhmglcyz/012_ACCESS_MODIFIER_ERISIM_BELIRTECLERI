package com.vektorel;

import com.vektorel.models.ornek2;

public class Runner {

	public static void main(String[] args) {
		
		ornek2 orn = new ornek2();
		
		orn.sayi2 =5; // public
		orn.method1();// public
		//default
		//protected
		//private
		
		Ornek1 orn2 = new Ornek1();
		
		orn2.sayi1 = 4;// default
		orn2.sayi2 = 5;// public
		orn2.sayi3 = 6;// protected
		// private
		

	}

}
