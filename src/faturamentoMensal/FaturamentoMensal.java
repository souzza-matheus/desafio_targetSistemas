package faturamentoMensal;

public class FaturamentoMensal {
	
	public static void main(String[] args) {
		
		System.out.println("================");
		System.out.println("Faturaamento mensal");
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros =19849.53;
		
		double total = SP + RJ + MG + ES + Outros;
		
		System.out.println("total: "+total);
		System.out.println("================");
	
		
		System.out.println("\n\n================");
		System.out.println("Porcentagem de participação por estado");
		System.out.println("SP: "+calcularPorcentagem(total,SP)+"%" );
		System.out.println("RJ: "+calcularPorcentagem(total,RJ)+"%" );
		System.out.println("MG: "+calcularPorcentagem(total,MG)+"%" );
		System.out.println("ES: "+calcularPorcentagem(total,ES)+"%" );
		System.out.println("Outros: "+calcularPorcentagem(total,Outros)+"%" );
		
		
		System.out.println("================");		
	}
	
	public static Double calcularPorcentagem( double totalMensal, double faturamento) {
		
		return (faturamento*100)/totalMensal;
	}
	

	
}
