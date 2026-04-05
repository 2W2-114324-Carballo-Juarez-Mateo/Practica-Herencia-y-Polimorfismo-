package SolucionesMatu;

public class Ejercicio8 {

    public interface Mascota{

        public void jugar();

    }

    public static abstract class Animal implements Mascota{

        private String nombre;
        private String raza;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public Animal(String nombre, String raza) {
            this.nombre = nombre;
            this.raza = raza;
        }

        public abstract void hacerSonido();

    }

    public static class Perro extends Animal{
        public Perro(String nombre, String raza) {
            super(nombre, raza);
        }

        public void hacerSonido(){
            System.out.println("Guau");
        }

        public void jugar(){
            System.out.println("Perro jugando...");
        }

    }

    public static class Gato extends Animal{
        public Gato(String nombre, String raza) {
            super(nombre, raza);
        }

        public void hacerSonido(){
            System.out.println("Miau");
        }

        public void jugar(){
            System.out.println("Gato jugando...");
        }
    }

    public static class Pajaro extends Animal{
        public Pajaro(String nombre, String raza) {
            super(nombre, raza);
        }

        public void hacerSonido(){
            System.out.println("Pio pio");
        }

        public void jugar(){
            System.out.println("Pajaro jugando...");
        }
    }

}
