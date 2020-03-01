package abstractclasseabstrata;

public class Chevrolet extends Carros{

    @Override
    public Seda criarSeda() {
        return new Cruze();
    }

    @Override
    public Suv criarSuv() {
        return new Captiva();
    }
    
}
