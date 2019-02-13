package exercicio;

public class TestaCofrinho {
	
	    public static void main(String[]args){
	    	
	    Cofrinho porco = new Cofrinho("rafael");
	    porco.destrancar();
	    porco.depositarMoeda10(5);
	    porco.depositarMoeda25(2);
	    porco.depositarMoeda50(10);
	    
	   
	   System.out.println(porco.dono);
	   System.out.println(porco.moedas10);
	   System.out.println(porco.moedas25);
	   System.out.println(porco.moedas50);
	   System.out.println(porco.calcularTotal());
	   System.out.println(porco.calcularTotalDolar(4.13));
	   porco.trancar();

	    
	          
	    
	}
	

}
