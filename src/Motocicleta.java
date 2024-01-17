import java.util.Date;

public class Motocicleta extends Vehiculomotorizado{

    public String motocicleta;


    public Motocicleta(String marca, String modelo, Date year, String combustible, String motocicleta) {
        super(marca, modelo, year, combustible);
        this.motocicleta = motocicleta;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de motocicleta "+motocicleta);
    }
}
