public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Punio Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y este es mi ataque Rayo Carga");
    }
}

