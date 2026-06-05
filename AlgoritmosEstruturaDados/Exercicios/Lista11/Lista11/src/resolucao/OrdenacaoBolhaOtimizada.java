package resolucao;

public class OrdenacaoBolhaOtimizada<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	public OrdenacaoBolhaOtimizada(T[] info) {
		super(info);
	}
	
	@Override
	public void ordenar() {
		int n = info.length;
		// usada para sabermos se algo aconteceu ou não
		boolean trocou;
		
		for(int i = 0; i < n - 1; i++) {
			trocou = false;
			
			for(int j = 0; j < n - 1; j++) {
				if (info[j].compareTo(info[j + 1]) > 0) {
					trocar(j, j + 1);
					trocou = true;
				}
			}
			
			// se nenhuma troca foi feita, o array está ordenado
			if (!trocou) {
				break;
			}
			
		}
	}
	
}
