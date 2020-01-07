package com.aula57.wrappers;

public class TesteWrapper {
	
	public static void main(String[]args) {
		
		//primitivos inteiros
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		
		//primitivos flutuantes
		float num5 = 3.5f;
		double num6 = 3.555555;
		
		//primitivos especiais
		boolean flag = true;
		char a = 'a';
		
		//Wrappers
		Short num7 = new Short((short)(1)); //casting realizado
		Byte num8 = new Byte((byte)(10));
		
		Integer num9 = new Integer(100); // e assim sucessivamente para as demais classes
		Double num9_1 = new Double(100); // e assim sucessivamente para as demais classes

		
		//mais coisas legais
		Integer num10 = new Integer("100"); // reconhece como um tipo Integer, porem nao coloque strings
		// ou recebera um NumberFormatException
		
		System.out.println(num9.doubleValue()); // consigo tbm converter uma classe wrapper para outra
		// aqui tinhamos o num9 como Integer e passamos para double, so fica a obs para valores menores
		//onde um tipo contem menos byte do que o outro, assim perdendo a precisão do valor como de double
		// para float
		
		Double num11 = num10.doubleValue(); // podemos tbm guardar numa variavel integer to Double
		
		double num12 = Double.parseDouble("12.3"); //tbm temos os metodos parse para conversao, 
		
	
		
	}

}
