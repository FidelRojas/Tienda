import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTienda {

	@Test
	void unNuevoProductoDebeDeTenerUnNombreVacio() {
		Producto producto= new Producto();
		Assert.assertEquals("", producto.GetNombre());
	}

}
