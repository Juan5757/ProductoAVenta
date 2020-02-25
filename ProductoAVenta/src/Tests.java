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
	
	@Test
	public void elAriticuloDeberiaRetornar10SiIngreso10EnElSaldo(){
		Articulo art = new Articulo();
		art.saldo = 0;
		art.setSaldo(10);
		Assert.assertEquals(10, art.getSaldo());
	}
	
	@Test
	public void elArticuloDeberiaRetornar5SiIngreso5EnElPrecio(){
		Articulo art = new Articulo();
		art.precio = 0;
		art.setPrecio(5);
		Assert.assertEquals(5, art.getPrecio());
	}
	
	@Test
	public void elArticuloDeberiaRetornarTrueSiIngreso2ComoCantidadDeDisponibilidad(){
		Articulo art = new Articulo();
		Assert.assertEquals(true,art.estaDisponible(2));
	}
	
	@Test
	public void elArticuloDeberiaRetornar15SiIngreso5ComoSaldoY10ComoPrecio(){
		Articulo art = new Articulo();
		art.nombre="Lapiz";
		art.saldo=5;
		art.precio=10;
		Assert.assertEquals(15,art.CalcularTarifa());
	}
}
