public class Jugador {

    private String nombre;
    private int numero;
    private String posicion;


    public Jugador(){
    }

    public Jugador(String nombre, int numero, String posicion){
        this.nombre = nombre;
        this.numero= numero;
        this.posicion = posicion;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumero(){
        return numero;
    }

    public String getPosicion(){
        return posicion;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public void setPosicion(){
        this.posicion = posicion;
    }

    public String showPlayerInfo(){
        return "El jugador " + this.nombre + " usa el número " + this.numero + " y juega como " + this.posicion;
    }

    @Override
    public String toString() {
        return "El jugador " + this.nombre + " usa el número " + this.numero + " y juega como " + this.posicion;
    }
}
