package SolucionesMatu;

public class Ejercicio123 {

    public static class Persona{

        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String presentarse() {
            return "Nombre: " + nombre + " |Edad: " + edad;
        }

    }

    public static class Estudiante extends Persona implements Ejercicio5.Imprimible {

        private String legajo;

        public String getLegajo() {
            return legajo;
        }

        public void setLegajo(String legajo) {
            this.legajo = legajo;
        }

        public Estudiante(String nombre, int edad, String legajo) {
            super(nombre, edad);
            this.legajo = legajo;
        }

        @Override
        public String presentarse(){
            return "Legajo: " + legajo + " |" + super.presentarse();
        }

        public void imprimir(){
            System.out.println("Imprimiendo Estudiante...");
        }
    }

}
