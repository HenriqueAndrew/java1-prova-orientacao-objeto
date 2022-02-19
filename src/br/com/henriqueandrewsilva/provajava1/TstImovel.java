// Henrique Andrew da Silva

package br.com.henriqueandrewsilva.provajava1;

public class TstImovel {
    
    public static void main(String[] args) {
        
        //Teste cadastro IMOVEL
        Casa c1 = new Casa();//Resolução do item 2
        
        //Inserindo dados CORRETOR
        c1.getCorretor().setNome("Alexandre");//Resolução do item E.1
        c1.getCorretor().setRg(123456789);
        
        //Inserindo dados CASA
        c1.setRua("Escocia");//Resolução do item E.1
        try{
        c1.setNumero(100);        
        }
        catch(NumException ne){ 
            ne.impMsg();
        }
        c1.setVagasCarro(2);        
        
        //Inserindo dados EDICULA
        c1.getEdicula().setRua("Inglaterra");
        try{
        c1.getEdicula().setNumero(10);//Resolução do item E.1       
        }
        catch(NumException ne){ 
            ne.impMsg();
        }        
        c1.getEdicula().setArea(25);
        
                
        //Impressao Cadastro do IMOVEL
        System.out.println("\t===============CADASTROS DE IMOVEIS===============\n\n");
        // Imóvel 1 
        System.out.println("\t\t\t>>>>>IMÓVEL 1<<<<<\n");
        System.out.println("\t===INFORMAÇÕES DO CORRETOR===");
        System.out.println("\tCorretor: " + c1.getCorretor().getNome()); //Resolução do item E.2
        System.out.println("\tRG: " + c1.getCorretor().getRg() + "\n");        
        System.out.println("\t===INFORMAÇÕES DA CASA===");
        System.out.println("\tRua da Casa: " + c1.getRua());
        System.out.println("\tNúmero da casa: " + c1.getNumero());
        c1.validNum();
        System.out.println("\tVagas garagem: " + c1.getVagasCarro());
        c1.calcRua(); //Resolução do item E.2
        System.out.println("\t===INFORMAÇÕES DA EDICULA===");
        System.out.println("\tRua da Edicula: " + c1.getEdicula().getRua());
        System.out.println("\tNúmero da Edícula: " + c1.getEdicula().getNumero());
        c1.getEdicula().validNum();
        System.out.println("\tÁrea da Edícula: " + c1.getEdicula().getArea() + " (m2)");
        c1.getEdicula().calcRua(); //Resolução do item E.2
    }   
    
}
