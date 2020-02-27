
public abstract class Producto {
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

	public abstract boolean estaDisponible(int cant);
	public abstract int calcularTarifa(int cantidad);

}
