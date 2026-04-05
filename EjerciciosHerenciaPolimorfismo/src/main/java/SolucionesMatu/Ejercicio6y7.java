package SolucionesMatu;

public class Ejercicio6y7 {

    public static abstract class Empleado{
        private String nombre;
        private double salario;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public abstract double calcularBono();
    }

    public static class Programador extends Empleado{
        public Programador(String nombre, double salario) {
            super(nombre, salario);
        }

        public double calcularBono(){
            return getSalario() * 1.15;
        }
    }

    public static class Gerente extends Empleado{
        public Gerente(String nombre, double salario) {
            super(nombre, salario);
        }

        public double calcularBono(){
            return getSalario() * 1.25;
        }
    }

    public static String procesarEmpleado(Empleado e){
        return "Nombre: " + e.getNombre() + " |Salario con Bono: " + e.calcularBono();
    }

}
