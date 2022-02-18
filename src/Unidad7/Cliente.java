package Unidad7;

import java.util.ArrayList;

/*
 * @autor Mario Bello Garcia.
 * @fecha 18/02/2022.
 * @Tarea Tarea7 de programacion DAM.
 */


public class Cliente {

	//Variables
	private String nombre;
	private ArrayList<Alquiler>prestamos=new ArrayList<>();

	//Constructores
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public Cliente() {
		this.prestamos=new ArrayList<Alquiler>();
	}
	
	//Métodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Alquiler> prestamos) {
		this.prestamos = prestamos;
	}


	//Método que introduce los objetos creados en el ArrayList.
	public void nuevoAlquiler(Alquiler a) {
		prestamos.add(a);
		
		

	}
	
	//Método que genera un tiket con los prestamos del Cliente.
	public void generarTiket() {
	
			double importe=0.00;//Variables con la que otorgamos el importe de los DVD
			double importeTotal=0.00;//Variable con la que sumamos los importes de las peliculas
			int numero=0;
			System.out.println("Cliente: "+nombre );
			for(int i=0;i<prestamos.size();i++) {
				
				switch(prestamos.get(i).getDvd().getTipoDVD()) {//Comprobamos el tipo de DVD y dependiendo el tipo le damos valor.
				case 1:
					importe=6.50;
					System.out.println("        "+prestamos.get(i).getDvd().getTitulo()+" "+importe+" €");		
					numero++;
					importeTotal+=importe;
					break;
				case 2:
					importe=8.50;
					System.out.println("        "+prestamos.get(i).getDvd().getTitulo()+" "+importe+" €");	
					numero++;
					importeTotal+=importe;
					break;
				case 3:
					importe=12.00;
					System.out.println("        "+prestamos.get(i).getDvd().getTitulo()+" "+importe+" €");
					numero++;
					importeTotal+=importe;
					break;
				case 0:
					importe=4.5;
					System.out.println("        "+prestamos.get(i).getDvd().getTitulo()+" "+importe+" €");
					numero++;
					importeTotal+=importe;
					break;
				
			}
			
			}
			System.out.println("Importe Total:"+importeTotal+" €");
			System.out.println("Número Prestamos: "+numero);
	}
}
	
	
	

	
		
	
	



	




	


