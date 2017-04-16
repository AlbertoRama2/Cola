package models;

import java.util.Arrays;

public class cola<t> {

	//atributos
	private t[] elemento;
	private int tamaño;
	
	//Constructor vacio
	public cola(){
		
		this.elemento=(t[]) new Object[this.tamaño]; //Reservará memoria para un array de 0 T elemento.
		
	}
	
	//metodos
	public void push(t element){
		this.elemento=Arrays.copyOf(this.elemento,this.tamaño+1);
	}
	
	public void remove(t elementos){
		int i=0;
		
		for(i=0;i<this.tamaño;i++){
			if(this.elemento[i]==elementos){
				this.elemento[i]=null;
				this.tamaño--;
				}
		}
	}
	
	public void pop(){
		this.elemento=Arrays.copyOf(this.elemento, this.elemento.length - 1);
		this.elemento[this.elemento.length-1] = this.elemento[0];

		
		}
	
	public void clear(){
		this.elemento=(t[]) new Object[this.tamaño];
	}
	
	public boolean contains(t element) {
		  boolean contiene = false;
		  int i=0;
		  
		  for (i = 0; i < this.elemento.length; i++) {
		   if (this.elemento[i] == element) {
		    contiene = true;
		   }
		  }
		  return contiene;
		 }
	
	public boolean isEmpty() {
		return this.tamaño == 0;
	}
	
	public int size(){
		return this.tamaño;
	}
}
