package sisu;

public class Candidato{
    String numero_enem, nome, curso, campus, demanda, estado, colocacao;
    double media;
    int ano;
    
    public Candidato(String [] c){        
        numero_enem = c[0];
        nome = c[1];
        curso = c[2];
        campus = c[3];
        demanda = c[4];
        colocacao = c[6];
        estado = c[7];
        
        media = Double.parseDouble(c[5]);
        ano = Integer.parseInt(c[8]);
    }    

    public String toString() {
        return nome + " - " + curso + " (" + media + ") - Colocação: " + colocacao;
    }
}