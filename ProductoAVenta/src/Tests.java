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
	
	@Test
	public void elProductoDeberiaRetornarTrueSiIngreso5ComoCantidadDeDisponibilidad(){
		Articulo art = new Articulo();
		art.precio = 0;
		art.setPrecio(5);
		Producto prod = art;
		Assert.assertEquals(true, prod.estaDisponible(5));
	}
	
	@Test 
	public void elProductoDeberiaRetornar25SiIngreso10ComoSaldoY15ComoPrecio(){
		Articulo art = new Articulo();
		art.nombre="Estuche";
		art.saldo=10;
		art.precio=15;
		Producto prod = art;
		Assert.assertEquals(25, prod.CalcularTarifa());
	}
	
	@Test
	public void elServicioDeberiaRetornarInternetSiIngresoInternet(){
		Servicio serv = new Servicio();
		serv.nombre = "Servicio";
		serv.setNombre("Internet");
		Assert.assertEquals("Internet", serv.getNombre());
	}
	
	@Test
	public void elServicioDeberiaRetornar30SiIngreso30EnElPrecio(){
		Servicio serv = new Servicio();
		serv.precio = 0;
		serv.setPrecio(30);
		Assert.assertEquals(30, serv.getPrecio());
	}
	
	@Test
	public void elServicioDeberiaRetornarTrueSiIngreso6ComoCantidadDisponible(){
		Servicio serv = new Servicio();
		Assert.assertEquals(true, serv.estaDisponible(6));
	}
	
}
