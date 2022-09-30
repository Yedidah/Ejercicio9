public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Trabajador trabajador =new Trabajador();

    cliente.nombre = "yedidah";
    System.out.println("Nombre de cliente"+ " "+ cliente.nombre);
    cliente.edad = 31;
    System.out.println("la edad del cliente es"+ " "+ cliente.edad + " "+"años");
    cliente.telefono = 31874898;
    System.out.println("El telefono del cliente es"+" "+cliente.telefono);
    cliente.credito = 2000;
    System.out.println("El cliente cuenta con un credito de"+ " "+ cliente.credito+" Dolares");

    trabajador.nombre = "Ahaba";
    System.out.println("EL nombre del trabajador es"+" "+trabajador.nombre);
    trabajador.edad = 33;
    System.out.println("la edad del trabajador es"+ " "+ trabajador.edad+" "+"años");
    trabajador.telefono = 311512669;
    System.out.println("El numero de telefono del trabajador es"+" "+ trabajador.telefono);
    trabajador.salario = 3000;
    System.out.println("El salario del trabajador es"+" "+ trabajador.salario+ "Dolares");


    }
}
class Persona {
    String nombre;
    int edad;
    int telefono;
}
final class Cliente extends Persona {
    double credito;
}
final class Trabajador extends Persona {
    double salario;
}