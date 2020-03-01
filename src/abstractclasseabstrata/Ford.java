package abstractclasseabstrata;

public class Ford extends Carros{

    @Override
    public Seda criarSeda() {
        return new Fusion(); 
    }

    @Override
    public Suv criarSuv() {
        return new Edge(); 
    }
    
}
