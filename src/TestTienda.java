import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTienda {

	@Test
	void unNuevoProductoDebeDeTenerUnNombreVacio() {
		Producto producto= new Producto();
		Assert.assertEquals("", producto.getNombre());
	}
	
	@Test
	void unNuevoProductoDebeDeTenerUnPrecioInicialDeCero() {
		Producto producto= new Producto();
		Assert.assertEquals(0, producto.getPrecio());
	}
	@Test
	void unNuevoArtiuloTieneQueTenerElNombreDelConstructor() {
		Producto producto= new Articulo("Candado",10);
		Assert.assertEquals("Candado", producto.getNombre());
	}
	@Test
	void unNuevoArtiuloTieneQueTenerElPrecioDelConstructor() {
		Producto producto= new Articulo("Candado",10);
		Assert.assertEquals(10, producto.getPrecio());
	}
	@Test
	void unNuevoServicioTieneQueTenerElNombreDelConstructor() {
		Producto producto= new Servicio("Chofer",50);
		Assert.assertEquals("Chofer", producto.getNombre());
	}
	@Test
	void unNuevoServicioTieneQueTenerElPrecioDelConstructor() {
		Producto producto= new Servicio("Chofer",50);
		Assert.assertEquals(50, producto.getPrecio());
	}
	@Test
	void unNuevoServicioTieneQueDevolverTrueSiEsQueEstaDisponible() {
		Servicio producto= new Servicio("Chofer",50);
		producto.setEstado(true);
		Assert.assertEquals(true, producto.estaDisponible());
	}
	@Test
	void unNuevoServicioTieneQueDevolverFalseSiEsQueNoEstaDisponible() {
		Servicio producto= new Servicio("Chofer",50);
		producto.setEstado(false);
		
		Assert.assertEquals(false, producto.estaDisponible());
	}

}
