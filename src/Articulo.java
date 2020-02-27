
public class Articulo extends Producto {
int saldo;
	public Articulo(String _nombre, int _precio) {
		this.precio=_precio;
		this.nombre=_nombre;
		// TODO Auto-generated constructor stub
	}
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
	@Override
	public boolean estaDisponible(int cant) {
		if(cant<=saldo)
			return true; 
		else
			return false;
		
		
	}
	@Override
	public int calcularTarifa(int cantidad) {
		return cantidad*precio;
	}

}
