package SolucionesMatu;

import java.text.DecimalFormat;

public class Ejercicio9 {

    public interface Recargable{
        public void recargar(double recarga);
    }

    public static abstract class Vehiculo implements Recargable{

        private String marca;
        private String modelo;

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public abstract void mover(double kilometros);
    }

    public static abstract class Auto extends Vehiculo{

        private String patente;

        public String getPatente() {
            return patente;
        }

        public void setPatente(String patente) {
            this.patente = patente;
        }

        public Auto(String marca, String modelo, String patente) {
            super(marca, modelo);
            this.patente = patente;
        }
    }

    public static class Bicicleta extends Vehiculo{

        private double energia;

        public double getEnergia() {
            return energia;
        }

        public void setEnergia(double energia) {
            this.energia = energia;
        }

        public Bicicleta(String marca, String modelo, double energia) {
            super(marca, modelo);
            this.energia = energia;
        }

        public void mover(double kilometros){

            DecimalFormat df = new DecimalFormat("#.##");

            if (2 * kilometros <= energia){

                energia -= 2 * kilometros;
                System.out.println("Kilometros Recorridos: " + df.format(kilometros) + ", Energia restante: " + df.format(energia));

            }
            else{
                System.out.println("No hay suficiente energia para recorrer esa cantidad de kilometros");
            }

        }

        public void recargar(double horasDescanso){

            DecimalFormat df = new DecimalFormat("#");

            energia += 20 * horasDescanso;

            if (energia > 100){
                energia = 100;
            }

            System.out.println("Energia recargada al " + df.format(energia) + "%");
        }
    }

    public static class AutoElectrico extends Vehiculo{
        private double bateria;

        public double getBateria() {
            return bateria;
        }

        public void setBateria(double bateria) {
            this.bateria = bateria;
        }

        public AutoElectrico(String marca, String modelo, double bateria) {
            super(marca, modelo);
            this.bateria = bateria;
        }

        public void mover(double kilometros){

            DecimalFormat df = new DecimalFormat("#.##");

            if (0.10 * kilometros <= bateria){

                bateria -= 0.10 * kilometros;
                System.out.println("Kilometros Recorridos: " + df.format(kilometros) + ", Bateria restante: " + df.format(bateria));

            }
            else{
                System.out.println("No hay suficiente bateria para recorrer esa cantidad de kilometros");
            }

        }

        public void recargar(double recargaBateria){

            DecimalFormat df = new DecimalFormat("#.##");

            double bateriaFaltante = 100 - bateria;

            if (recargaBateria > bateriaFaltante){
                bateria += bateriaFaltante;
                recargaBateria -= bateriaFaltante;
            }
            else{
                bateria += recargaBateria;
                recargaBateria = 0;
            }

            System.out.println("Bateria recargada al " + df.format(bateria) + "%");
            System.out.println("Energia sobrante de la carga: " + df.format(recargaBateria));
        }
    }

}
