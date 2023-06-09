package util;

public class converter {

	public static final double PORCENTAGEM = 13;

	public static double conversor(double dolar, double amount){
		double valor = dolar*amount;
		return valor += valor*PORCENTAGEM/100;
		}
}