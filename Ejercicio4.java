package com.generation;

import java.util.Scanner;

public class Codigo4{
	public static void main(String[] args) {//Se agregar clase main para correr el programa
		
		Scanner s =  new Scanner(System.in);// se agregar System.in
	    
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): " );
	    
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): " );//cambia nombre del jugador
	    //Se elimina la segunda instacia de Scanner
	    
	    String j2 = s.nextLine();  // se le entrega el valor en s
	    

	    if(j1 == j2){
		      System.out.println("Empate");
		
	    }else{
	    	int g = 2;
		    switch(j1) {
		        case "piedra":
		        if (j2 == "tijeras") {
		            g = 1;
		        }
		        case "papel":
		          if (j2 == "piedra") {
		            g = 1;
		          }// se agrega "}"
		        case "tijera":
		          if (j2 =="papel") {// cambia equals por "=="
		            g = 1;
		          }
		          break;
		        default: g = 2;
		      }
		      System.out.println("Gana el jugador " + g);
		 }	  
}
}
