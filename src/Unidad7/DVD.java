package Unidad7;


/*
 * @autor Mario Bello Garcia.
 * @fecha 18/02/2022.
 * @Tarea Tarea7 de programacion DAM.
 */



public class DVD {


//Variables
public static int infantil=0;
public static int adulto=1;
public static int juvenil=2;
public static int novedad=3;
private String Titulo;
private int TipoDVD;

//Constructor
public DVD(String titulo, int tipoDVD) {

	Titulo = titulo;
	TipoDVD = tipoDVD;
}

//Métodos get y set 
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}
public int getTipoDVD() {
	return TipoDVD;
}
public void setTipoDVD(int tipoDVD) {
	TipoDVD = tipoDVD;
}



	 
}
