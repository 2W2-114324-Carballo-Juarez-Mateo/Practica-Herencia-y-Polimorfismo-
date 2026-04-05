package SolucionesMatu;

public class Ejercicio4 {

    public static abstract class FiguraGeometrica{

        public abstract double calcularArea();

    }

    public static class Rectangulo extends FiguraGeometrica{

        private double base;
        private double altura;

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public Rectangulo(double altura, double base) {
            this.altura = altura;
            this.base = base;
        }

        @Override
        public String toString() {
            return "Altura: " + altura + " |Base: " + base;
        }

        public double calcularArea(){
            return base * altura;
        }
    }

    public static class Circulo extends FiguraGeometrica{

        private double diametro;

        public double getDiametro() {
            return diametro;
        }

        public void setDiametro(double diametro) {
            this.diametro = diametro;
        }

        public Circulo(double diametro) {
            this.diametro = diametro;
        }

        @Override
        public String toString() {
            return "Diametro: " + diametro;
        }

        public double calcularArea(){
            return Math.PI * Math.pow((diametro / 2), 2);
        }
    }

}
