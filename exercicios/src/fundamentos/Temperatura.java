package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura Fahrenheit " + fahrenheit + "°C para Celsius é " + celsius + "°C.");

		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura Fahrenheit " + fahrenheit + "°C para Celsius é " + celsius + "°C.");
	}

}
