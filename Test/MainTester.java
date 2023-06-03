import java.util.ArrayList;

public class MainTester {
    public static void main(String[] args) {
        //Auto
        Auto veh1 = new Auto("BMW", "E34", 1994, "rojo");
        Auto veh2 = new Auto("Toyota", "Celica", 1990, "rojo");


        System.out.println(veh1.acelerar() + " el " + veh1.getModelo());
        System.out.println(veh1.frenar()+ " el " + veh1.getModelo());
        veh1.setColor("negro");
        String giro = veh1.girar("izquierda");
        System.out.println(giro);
        veh1.mostrarInfo();

        System.out.println(" ");

        System.out.println(veh2.acelerar() + " el " + veh2.getModelo());
        System.out.println(veh2.frenar()+ " el " + veh2.getModelo());
        veh2.setColor("rojo");
        System.out.println(veh2.girar("derecha"));
        veh2.mostrarInfo();

        System.out.println(" ");
        
        //Equipo fútbol
        Jugador jug1 = new Jugador("Juan", 10, "Delantero");
        Jugador jug2 = new Jugador("Daniel", 6, "Defensa");
        Jugador jug3 = new Jugador("Cristiano", 7,  "Extremo");

        System.out.println(jug1.showPlayerInfo());

        EquipoFutbol eq1 = new EquipoFutbol("Deportivo Tapitas", new ArrayList<>());
        eq1.addPlayer(jug1);
        eq1.addPlayer(jug2);
        eq1.addPlayer(jug3);

        System.out.println(eq1.showTeamInfo());

    }
}
