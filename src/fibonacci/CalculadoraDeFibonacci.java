package fibonacci;

public class CalculadoraDeFibonacci {
	public int calcular (int n) {
		int atual = 0;
		int anterior = 0;
		
		for(int i = 1; i<=n; i++) {
			if(i==1) {
				atual = 1;
				anterior = 0;
				
			}else {
				atual += anterior;
				anterior = atual - anterior;
			}
		}
		
		return atual;
	}
}
