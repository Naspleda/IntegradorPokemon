public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Latigo Cepa");
    }
}
