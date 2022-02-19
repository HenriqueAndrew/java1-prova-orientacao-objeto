// Henrique Andrew da Silva

package br.com.henriqueandrewsilva.provajava1;

//Classe abstrata
public abstract class Imovel {
    //Resolução do item 1 e 3
    private String rua = " ";
    private int numero = 0;
    private Corretor corretor = new Corretor();
    
    //Resolução do item 4    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws NumException {        
            if(numero <= 5000){
                this.numero = numero;                
            }                
            else{
                throw new NumException();
            }            
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
    
    public abstract void calcRua();  
    
}
