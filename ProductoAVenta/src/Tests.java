import org.junit.Assert;
import org.junit.Test;


public class Tests {

	@Test
	public void elArticuloDeberiaRetornarLapizSiIngresoLapiz(){
		Articulo art = new Articulo();
		Assert.assertEquals("Lapiz", art.setNombre("Lapiz"));
	}
}
