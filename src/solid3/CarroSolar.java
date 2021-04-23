package solid3;

public class CarroSolar extends Carro{
	
	CarroSolar() {
		combustivel = null;
	}
	
	//Eu acabei de quebrar o que o meu carro faz
	//um carro solar não pode ser abastecido como um carro qualquer
	//não posso de uma subclasse mudar como o método da classe
	//super funciona
	public void abastecerCarro(){
		try {
			throw new Exception("Carro solar não pode ser abastecido");
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
