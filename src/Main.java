import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo=new Vehiculo("seat","leon",new Date());
        vehiculo.mostrarDetalles();
        Vehiculomotorizado vehiculomotorizado=new Vehiculomotorizado("Seat","ibiza",new Date(),"electrico");
        vehiculomotorizado.mostrarDetalles();
        Automovil automovil=new Automovil("opel","marte",new Date(),"diesel",5);
        automovil.mostrarDetalles();
        Motocicleta motocicleta=new Motocicleta("audi","agua",new Date(),"diesel","cruiser");
        motocicleta.mostrarDetalles();

    }



}
