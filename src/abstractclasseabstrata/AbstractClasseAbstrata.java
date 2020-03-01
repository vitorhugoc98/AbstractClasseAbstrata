package abstractclasseabstrata;

public class AbstractClasseAbstrata {

    public static void main(String[] args) {
        Carros modeloFord = new Ford(); 
        Seda seda00 = modeloFord.criarSeda(); 
        seda00.exibirModelo();
        
        System.out.println("");
        
        Carros modeloChevrolet = new Chevrolet(); 
        Seda seda01 = modeloChevrolet.criarSeda(); 
        seda01.exibirModelo();
        
        System.out.println("");
        
        Suv suv00 = modeloFord.criarSuv(); 
        suv00.exibirModelo();
        
        System.out.println("");
        
        Suv suv01 = modeloChevrolet.criarSuv(); 
        suv01.exibirModelo();
        
        
    }
    
}
