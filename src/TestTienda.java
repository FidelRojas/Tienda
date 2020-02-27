import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTienda {

	@Test
	void unNuevoProductoDebeDeTenerUnNombreVacio() {
		Producto producto= new Articulo();
		Assert.assertEquals("", producto.getNombre());
	}
	
	@Test
	void unNuevoProductoDebeDeTenerUnPrecioInicialDeCero() {
		Producto producto= new Articulo();
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
		Assert.assertEquals(true, producto.estaDisponible(1));
	}
	@Test
	void unNuevoServicioTieneQueDevolverFalseSiEsQueNoEstaDisponible() {
		Servicio producto= new Servicio("Chofer",50);
		producto.setEstado(false);
		Assert.assertEquals(false, producto.estaDisponible(1));
	}
	@Test
	void unNuevoArticuloTieneQueDevolverFalseSiEsQueNoEstaDisponible() {
		Articulo producto= new Articulo("Candado",10);
		producto.setSaldo(10);
		Assert.assertEquals(false, producto.estaDisponible(11));
	}
	@Test
	void unNuevoArticuloTieneQueDevolverTrueSiEsQueNoEstaDisponible() {
		Articulo producto= new Articulo("Candado",10);
		producto.setSaldo(10);
		Assert.assertEquals(true, producto.estaDisponible(5));
	}
	@Test
	void calcularTarifaDeUnArticuloDebeDeDevolcerLaCantidadPorPrecio() {
		Articulo producto= new Articulo("Candado",10);
		Assert.assertEquals(50, producto.calcularTarifa(5));
	}
	@Test
	void calcularTarifaDeUnProductoDebeDeDevolcerElPrecioPorLaCantidad() {
		Servicio producto= new Servicio("Candado",10);
		Assert.assertEquals(20, producto.calcularTarifa(2));
	}
	@Test
	void calcularTarifaDeUnProductoMayorA3DebeDeDevolcerElPrecioPorLaCantidadMenosEl10Porciento() {
		Servicio producto= new Servicio("Candado",10);
		Assert.assertEquals(90, producto.calcularTarifa(10));
	}
}
