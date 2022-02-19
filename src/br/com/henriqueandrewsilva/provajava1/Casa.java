// Henrique Andrew da Silva

package br.com.henriqueandrewsilva.provajava1;

final public class Casa extends Imovel implements Verifica {
    //Resolução do item 1 e 3
    private int vagasCarro = 0;
    private Edicula edicula = new Edicula();
    
    //Resolução do item 4 
    public int getVagasCarro() {
        return vagasCarro;
    }

    public void setVagasCarro(int vagasCarro) {
        this.vagasCarro = vagasCarro;
    }

    public Edicula getEdicula() {
        return edicula;
    }

    public void setEdicula(Edicula edicula) {
        this.edicula = edicula;
    }
    
    @Override
    public void validNum(){
        if(super.getNumero() == 0){             
            System.out.println("\tNumero nao informado ou passou do limite permitido 5000");  
        } 
        if(super.getNumero() < 100 && super.getNumero() > 0){             
            System.out.println("\tNumero da casa menor que 100!"); 
        }        
    }    

    @Override
    public void calcRua() { 
        int qtdeL = getRua().length();
        System.out.println("\tO nome da rua da CASA tem a quantidade de: " + qtdeL + " letras\n");
    }
        
}
