package models;

import java.util.Arrays;

public class cola<t> {

	//atributos
	private t[] elemento;
	private int tama�o;
	
	//Constructor vacio
	public cola(){
		
		this.elemento=(t[]) new Object[this.tama�o]; //Reservar� memoria para un array de 0 T elemento.
		
	}
	
	//metodos
	public void push(t element){
		this.elemento=Arrays.copyOf(this.elemento,this.tama�o+1);
	}
	
	public void remove(t elementos){
		int i=0;
		
		for(i=0;i<this.tama�o;i++){
			if(this.elemento[i]==elementos){
				this.elemento[i]=null;
				this.tama�o--;
				}
		}
	}
	
	public void pop(){
		this.elemento=Arrays.copyOf(this.elemento, this.elemento.length - 1);
		this.elemento[this.elemento.length-1] = this.elemento[0];

		
		}
	
	public void clear(){
		this.elemento=(t[]) new Object[this.tama�o];
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
		return this.tama�o == 0;
	}
	
	public int size(){
		return this.tama�o;
	}
}
