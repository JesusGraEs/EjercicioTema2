package es.jesus.Ejerciciot2;

public class Cliente
{
	/* Atributos */
	private String DniCliente;
	private String Nombre;
	private String DireccionCliente;
	
	/* Constructor por defecto */
	public Cliente()
	{
		DniCliente = "";
		Nombre = "";
		DireccionCliente = "";
	}
	
	/* Constructor con par�metros */
	public Cliente(String dni, String nC, String dC)
	{
		DniCliente = dni;
		Nombre = nC;
		DireccionCliente = dC;
	}
	
	/* M�todos */
	public String getDniCliente()
	{
	    return DniCliente;
	}
	public void setDniCliente(String dni)
	{   
		DniCliente = dni;
	}
	
	public String getNombre()
	{
	    return Nombre;
	}
	public void setNombre(String nC)
	{   
		Nombre = nC;
	}
	
	public String getDireccionCliente()
	{
	    return DireccionCliente;
	}
	public void setDireccionCliente(String dC)
	{
		DireccionCliente = dC;
	}
}
