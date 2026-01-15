
class Conductor {

    //* Atributos /
    private String nombre;
    
    static int totalConductores=0;

    //* Métodos /

    public Conductor(String nombre){
        this.nombre = nombre;
        totalConductores++;
    }

    public String getNombre(){
        return nombre;

    }
    

    
}
