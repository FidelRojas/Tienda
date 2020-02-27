
public class Servicio extends Producto {

	boolean disponible=false;
	public Servicio(String _nombre, int _precio) {
		this.precio=_precio;
		this.nombre=_nombre;
	}
	public void setEstado(boolean estado) {
		disponible=estado;
	}
	@Override
	public boolean estaDisponible() {
		return disponible;
	}

}
