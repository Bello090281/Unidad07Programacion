package Unidad7;

/*
 * @autor Mario Bello Garcia.
 * @fecha 18/02/2022.
 * @Tarea Tarea7 de programaci�n DAM.
 */
import java.util.ArrayList;

public class Alquiler {

	//Variables
	private DVD dvd;
	private int duracion;
	
	//Constructor
	public Alquiler(DVD dvd, int duracion) {
		this.dvd = dvd;
		this.duracion = duracion;
	}
	
	//Método get y set 
	public DVD getDvd() {
		return dvd;
	}
	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	//Metodo main, metodo ejecutable
	public static void main(String[] args) {
		
		DVD midvd=new DVD("Shrek", DVD.infantil);//Creamos un objeto DVD
		DVD midvd1=new DVD("EMMA", DVD.novedad);
		DVD midvd2=new DVD("Mario",DVD.adulto);
	
		
		Alquiler a=new Alquiler(midvd,4);//Creamos un objeto donde introducimos el objeto DVD y añadimos el periodo.
		Alquiler aa=new Alquiler(midvd1,3);
		Alquiler aaa=new Alquiler(midvd2, 2);
		
		
		Cliente c=new Cliente("Mario"); //Damos nombre a la vriable creada en la clase Cliente
		c.nuevoAlquiler(a);//Añadimos el objeto Alquiler dentro del ArrayList creado en las variables, llamamos al metodo creado en la clase Cliente
		c.nuevoAlquiler(aa);
		c.nuevoAlquiler(aaa);
		
		
		c.generarTiket();//Generamos el tiket del prestamo, llamamos al metodo de la clase Cleinte con ese nombre
		
	
		}
	}
	

