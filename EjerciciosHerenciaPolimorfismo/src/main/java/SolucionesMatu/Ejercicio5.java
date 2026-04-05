package SolucionesMatu;

public class Ejercicio5 {

    public interface Imprimible{
        void imprimir();
    }

    public static class Profesor extends Ejercicio123.Persona implements Imprimible {
        private String identificacion;

        public String getIdentificacion() {
            return identificacion;
        }

        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
        }

        public Profesor(String nombre, int edad, String identificacion) {
            super(nombre, edad);
            this.identificacion = identificacion;
        }

        @Override
        public String presentarse() {
            return super.presentarse() + " |Identificacion: " + identificacion;
        }

        public void imprimir(){
            System.out.println("Imprimiendo Profesor...");
        }
    }

}
