public class Main {
    public static void main(String[] args) {
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        charmander.atacarMordisco();
        charmander.atacarLanzallamas();
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();

    }
}