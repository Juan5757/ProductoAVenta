
public class Servicio {

	String nombre;
	int precio;

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre=nombre;
	}

	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		this.precio = precio;
	}

	public int getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	public Object estaDisponible(int cantidad) {
		// TODO Auto-generated method stub
		if(cantidad>1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
