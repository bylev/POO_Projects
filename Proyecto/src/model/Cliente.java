class Cliente {
    private String nombre;
    private String curp;
    private String telefono;

    public Cliente(String nombre, String curp, String telefono){
        this.nombre   = nombre;
        this.curp     = curp;
        this.telefono = telefono;
    }

    public String obteneResumen(){
            return "Nombre: " + nombre + "\n" + 
                    "CURP: " + curp + "\n" + 
                    "Telefono: " + telefono;
    }
}
