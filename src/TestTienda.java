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
//	@Test
//	void unNuevoArtiuloTieneQueTenerElNombreDelConstructor() {
//		Producto producto= new Articulo("Candado");
//		Assert.assertEquals("", producto.GetNombre());
//	}

}
