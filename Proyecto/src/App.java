
public class App{
    public static void main(String[] args) {
       
        Cliente c1 = new Cliente("Michelle", "CAGM010224MYNMNCA0", "9997485722");

        System.out.println("----Datos del Cliente----\n" + c1.obteneResumen());
    }
}