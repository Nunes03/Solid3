package solid3;

public class Carro {
	int velocidade = 0;
	Integer combustivel = 0;
	boolean isLigado = false;
	
	public void acelerarCarro() {
		this.velocidade++;
	}
	
	public void freiarCarro() {
		if(velocidade > 1) {
			this.velocidade--;

		} else {
			this.velocidade = 0;
		}
	}

	public void abastecerCarro() {
		Posto posto = new Posto();
		posto.abastecer(this);
	}
	
	public void queimarCombustivel() {
		this.combustivel--;
	}
	
	public void ligarCarro() {
		this.isLigado = true;
	}
	
}
