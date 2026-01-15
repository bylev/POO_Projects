public class App {

    public static void main(String[] args) {
        
        //* Crear usuario y conductor*/

        Usuario u1 = new Usuario("Michi", 400);
        Usuario u2 = new Usuario("Emilio", 300);
        Usuario u3 = new Usuario("Carlos", 600);

        Conductor c1 = new Conductor("Pancho");
        Conductor c2 = new Conductor("Ana");
        Conductor c3 = new Conductor("Eduardo");

        //* Consultar  */

        System.out.println("Usuario: " + u1.getNombre());
        System.out.println("Saldo: " + u1.getSaldo());
        System.out.println("Conductor asignado: " + c1.getNombre());
        System.out.println("Total de usuarios: " + Usuario.totalUsuarios);
        System.out.println("Total de conductores: " + Conductor.totalConductores);
       
        

    }
    
}

    
