import java.util.Date;

public class Automovil extends Vehiculomotorizado {
public int Puertas;


    public Automovil(String marca, String modelo, Date year, String combustible, int puertas) {
        super(marca, modelo, year, combustible);
        Puertas = puertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Este automovil tiene un numero de puertas de "+Puertas);
    }
}

