
public class Producto {
	int precio=0;
	String nombre="";

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public int getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean estaDisponible(int cant) {
		// TODO Auto-generated method stub
		return false;
	}
	public int calcularTarifa(int cantidad) {
		return precio*cantidad;
		
	}

}
