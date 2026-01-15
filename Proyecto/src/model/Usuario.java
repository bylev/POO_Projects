
class Usuario {
    //*Atributos */
    private String nombre;
    private double saldo; 


    static int totalUsuarios = 0;
    
    public Usuario(String nombre, double saldo){ //* Constructor: Defino qué datos iniciales tendrá mi objeto*/
        this.nombre = nombre;
        this.saldo = saldo; 
        totalUsuarios++; 
    }

    public String getNombre(){
        return nombre;
    }

    public double getSaldo(){
        return saldo;
    }
}
