public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String color;


    public Auto(){

    }

    public Auto(String marca, String modelo, int anio, String color){
        this.marca= marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String acelerar(){
        return "Acelerando";
    }

    public String frenar(){
        return "Frenando";
    }

    public String girar(String direcc){
        if(direcc.equalsIgnoreCase("izquierda")){
            return ("Giraste a la izquierda");
        }else{
            return "Giraste a la derecha";
        }
    }
    public void mostrarInfo(){
        System.out.println("La marca del coche es: " + this.marca + ", el modelo del coche es: " + this.modelo +
                ", el año en el que se fabricó fue : " + this.anio + " y su color es " + this.color);
    }
}

