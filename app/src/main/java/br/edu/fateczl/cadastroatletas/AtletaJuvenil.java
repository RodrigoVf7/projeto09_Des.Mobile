package br.edu.fateczl.cadastroatletas;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */
public class AtletaJuvenil extends Atleta {
    private int anosPratica;

    public AtletaJuvenil(String nome, String dataNascimento, String bairro, int anosPratica) {
        super(nome, dataNascimento, bairro);
        this.anosPratica = anosPratica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Anos de Prática: " + anosPratica;
    }
}

