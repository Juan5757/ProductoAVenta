import org.junit.Assert;
import org.junit.Test;


public class Tests {

	@Test
	public void elArticuloDeberiaRetornarLapizSiIngresoLapiz(){
		Articulo art = new Articulo();
		art.nombre = "Objeto";
		art.setNombre("Lapiz");
		Assert.assertEquals("Lapiz",art.getNombre());
	}
	
}
