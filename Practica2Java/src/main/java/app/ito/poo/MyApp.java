package app.ito.poo;

import java.time.LocalDate;
import Practica2UML.CuentaBancaria;

public class MyApp {
	
    static void run() {
    	System.out.println(new CuentaBancaria(89393L, "Lucia Mendoza",1500,
    			LocalDate.of(2021, 2, 18)));
    }
	public static void main(String[] args) {
		run();
	}

}
