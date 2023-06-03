import java.util.ArrayList;
import java.util.Arrays;

public class EquipoFutbol {

    private String nombreEquipo;
    private ArrayList<Jugador> listaJugadores;


    public EquipoFutbol(){

    }

    public EquipoFutbol(String nombreEquipo, ArrayList<Jugador> listaJugadores){
        this.nombreEquipo = nombreEquipo;
        this.listaJugadores = listaJugadores;
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }
    public void setNombreEquipo(){
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void addPlayer(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public String showTeamInfo(){
        return "El equipo " + this.nombreEquipo + " tiene estos jugadores " + this.listaJugadores ;
    }
}
