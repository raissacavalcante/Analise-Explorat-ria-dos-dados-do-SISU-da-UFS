package sisu;

public class Candidato{
    String numero_enem, nome, curso, campus, demanda, estado, colocacao;
    double media;
    int ano;
    
    public Candidato(String [] c){        
        numero_enem = c[0];
        nome = c[1];
        curso = c[2];
        // Lógica para corrigir o nome do campus
        if (c[3].equals("CAMPUS DO SER")) {
            campus = "CAMPUS DO SERTAO";
        } else {
             campus = c[3];
        }
        demanda = tratamentoDemanda(c[4]);
        colocacao = c[6];
        estado = c[7];
        
        media = Double.parseDouble(c[5]);
        ano = Integer.parseInt(c[8]);
    }    

    public String toString() {
        return nome + " - " + curso + " (" + media + ") - Colocação: " + colocacao;
    }
    
    public String tratamentoDemanda(String s) {
        if (s.startsWith("A")) { 
            return "Ampla Concorrencia";
        }
        if (s.startsWith("V")) { 
            return "PcD";
        }
        
        if (s.equals("L1") || s.equals("LB_EP")) {
            return "Escola pública, baixa renda";
        }
                
        if (s.equals("L2") || s.equals("LB_PPI")) {
            return "Escola pública, baixa renda, PPI";
        }
        
        if (s.equals("L5") || s.equals("LI_EP")) {
            return "Escola pública";
        }  
       
        if (s.equals("L6") || s.equals("LI_PPI")) {
            return "Escola pública, PPI";
        }  
        
        if (s.equals("L6") || s.equals("LI_PPI")) {
            return "Escola pública, PPI";
        }  
        if (s.equals("L9") || s.equals("LB_PCD")) {
            return "Escola pública, baixa renda, PcD";
        }  
        if (s.equals("L10")) {
            return "Escola pública, baixa renda, PcD, PPI";
        }  
        if (s.equals("L13") || s.equals("LI_PCD")) {
            return "Escola pública, PcD";
        }  
        if (s.equals("L14")) {
            return "Escola pública, PcD, PPI";
        }  
        if (s.equals("LI_Q")) {
            return "Escola pública, quilombola";
        }  
        if (s.equals("LB_Q")) {
            return "Escola pública, baixa renda, quilombola";
        }  
        return "Demanda não Identificada";
    }
}