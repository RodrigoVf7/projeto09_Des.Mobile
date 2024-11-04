package br.edu.fateczl.cadastroatletas;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */
public class Atleta {
    protected String nome;
    protected String dataNascimento;
    protected String bairro;

    public Atleta(String nome, String dataNascimento, String bairro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Bairro: " + bairro;
    }
}
