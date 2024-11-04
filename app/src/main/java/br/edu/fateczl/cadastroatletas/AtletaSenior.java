package br.edu.fateczl.cadastroatletas;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */
public class AtletaSenior extends Atleta {
    private boolean problemasCardiacos;

    public AtletaSenior(String nome, String dataNascimento, String bairro, boolean problemasCardiacos) {
        super(nome, dataNascimento, bairro);
        this.problemasCardiacos = problemasCardiacos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Problemas Cardíacos: " + (problemasCardiacos ? "Sim" : "Não");
    }
}
