
public class Articulo {

	String nombre;
	int saldo;
	int precio;
	
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void setSaldo(int saldo) {
		// TODO Auto-generated method stub
		this.saldo = saldo;
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		this.precio = precio;
	}

	public int getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	public boolean estaDisponible(int i) {
		// TODO Auto-generated method stub
		if(i > 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	
}
