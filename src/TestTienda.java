import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTienda {

	@Test
	void unNuevoProductoDebeDeTenerUnNombreVacio() {
		Producto producto= new Producto();
		Assert.assertEquals("", producto.GetNombre());
	}
	
	@Test
	void unNuevoProductoDebeDeTenerUnPrecioInicialDeCero() {
		Producto producto= new Producto();
		Assert.assertEquals(0, producto.GetPrecio());
	}
	@Test
	void unNuevoArtiuloTieneQueTenerElNombreDelConstructor() {
		Producto producto= new Articulo("Candado",10);
		Assert.assertEquals("Candado", producto.GetNombre());
	}
	@Test
	void unNuevoArtiuloTieneQueTenerElPrecioDelConstructor() {
		Producto producto= new Articulo("Candado",10);
		Assert.assertEquals(10, producto.GetPrecio());
	}
	@Test
	void unNuevoServicioTieneQueTenerElNombreDelConstructor() {
		Producto producto= new Servicio("Chofer",50);
		Assert.assertEquals("Chofer", producto.GetNombre());
	}
	@Test
	void unNuevoServicioTieneQueTenerElPrecioDelConstructor() {
		Producto producto= new Servicio("Chofer",50);
		Assert.assertEquals(50, producto.GetPrecio());
	}

}
