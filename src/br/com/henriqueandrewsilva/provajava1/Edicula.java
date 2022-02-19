// Henrique Andrew da Silva

package br.com.henriqueandrewsilva.provajava1;

final public class Edicula extends Imovel implements Verifica {
    //Resolução do item 1 e 3
    private int area = 0;
    
    //Resolução do item 4 
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    @Override
    public void validNum() {        
        if(super.getNumero() % 2 != 0){ 
            System.out.println("\tNúmero da Edicula é impar!");
        }
        else{
            System.out.println("\tNúmero da Edicula é par!");
        }
        
    }
        
    @Override
    public void calcRua() {
        char primL = getRua().charAt(0);
        System.out.println("\tA primeira letra do nome da rua da EDICULA é a letra: " + primL);
    }
    
}
