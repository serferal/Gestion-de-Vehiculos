import java.util.Date;

public class Vehiculo {

public String marca,modelo;
Date year;

    public Vehiculo(String marca, String modelo, Date year) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public void mostrarDetalles (){
        System.out.println("la marca es "+marca+" y el modelo seria "+modelo+" del año "+year);
    }

}
