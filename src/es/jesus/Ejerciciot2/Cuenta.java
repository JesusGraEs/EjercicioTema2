package es.jesus.Ejerciciot2;

public class Cuenta
{
	/* Atributos */
	private int NumeroCuenta;
	private int Saldo;
	private Cliente cliente;

	/* Constructor por defecto */
	public Cuenta()
	{
		NumeroCuenta = 0;
		Saldo = 0;
		cliente = new Cliente();
	}
	
	/* Constructor con parámetros */
	public Cuenta (int nuC, int s, Cliente c)
	{
		NumeroCuenta = nuC;
		Saldo = s;
		cliente = c;
		
	}
	/* Métodos */
	public int getNumeroCuenta()
	{
		return NumeroCuenta;
	}
	public void setNumeroCuenta(int nuC)
	{
		NumeroCuenta = nuC;	
	}
	public int getSaldo()
	{
		return Saldo;
	}
	public void setSaldo(int s)
	{
		Saldo = s;
	}
	public Cliente getCliente()
	{
		return cliente;
	}
	public void setCliente(Cliente c)
	{
		cliente = c;
	}
}
