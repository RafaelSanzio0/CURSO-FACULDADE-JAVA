package exercicio;

public class Cofrinho {
	
	
	    String dono;
	    boolean estado;
	    int moedas10;
	    int moedas25;
	    int moedas50;
	    
	    
	    public Cofrinho() {
	    	
	    }
	    
	    public Cofrinho(String dono) {
	    	this.dono = dono;
	    }
	    
	    public  void trancar(){
	        this.estado = true;
	        System.out.println("O cofrinho esta trancado");
	       }
	    
	    public void destrancar(){
	        this.estado = false;
	        System.out.println("O cofrinho esta destrancado"); 
	    }
	    
	    public void depositarMoeda10(int quant){
	        this.moedas10 = this.moedas10 + quant;  
	    }
	    
	    public void depositarMoeda25(int quant){
	        this.moedas25 = this.moedas25 + quant;
	    }
	    
	    public void depositarMoeda50(int quant){
	        this.moedas50 = this.moedas50 + quant;
	    }
	    
	    public double calcularTotal(){
	        double total = (this.moedas10 * 0.1)+(this.moedas25 * 0.25)+(this.moedas50 * 0.50);
	        
	        return total; 
	    }
	    
	    public double calcularTotalDolar(double valorDolar){
	        
	        double totalDolar =  ((this.moedas10 * 0.1)+(this.moedas25 * 0.25)+(this.moedas50 * 0.50)) / valorDolar;
	        
	        return totalDolar;  
	   
	    }
	    
}
