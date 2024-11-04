package br.edu.fateczl.cadastroatletas;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */
public class AtletaGeral extends Atleta {
    private String academia;
    private double recordeSegundos;

    public AtletaGeral(String nome, String dataNascimento, String bairro, String academia, double recordeSegundos) {
        super(nome, dataNascimento, bairro);
        this.academia = academia;
        this.recordeSegundos = recordeSegundos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Academia: " + academia + ", Recorde: " + recordeSegundos + " segundos";
    }
}

