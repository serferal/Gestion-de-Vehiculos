import java.util.Date;

public class Vehiculomotorizado extends Vehiculo{

   public String combustible;



    public Vehiculomotorizado(String marca, String modelo, Date year, String combustible) {
        super(marca, modelo, year);
        this.combustible = combustible;

    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Este vehiculo usa combustible "+combustible);
    }
}


