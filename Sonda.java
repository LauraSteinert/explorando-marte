/* Classe para definir as coisas da Sonda, tal qual posição e orientação. */

public abstract class Sonda {

	private Posicao posicao;
	private Direcao direcao;
	
	private Sonda(Direcao direcao, Posicao posicao){
		this.direcao = direcao;
		this.posicao = posicao;
	}
}