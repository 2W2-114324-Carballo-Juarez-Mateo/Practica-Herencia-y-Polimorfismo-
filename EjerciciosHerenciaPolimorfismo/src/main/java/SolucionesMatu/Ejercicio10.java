package SolucionesMatu;

import java.time.LocalDate;

public class Ejercicio10{

    public interface Validable{
        public String validar();
    }

    public static abstract class MedioPago implements Validable{
        private String identificacion;
        private double monto;

        public String getIdentificacion() {
            return identificacion;
        }

        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
        }

        public double getMonto() {
            return monto;
        }

        public void setMonto(double monto) {
            this.monto = monto;
        }

        public MedioPago(String identificacion, double monto) {
            this.identificacion = identificacion;
            this.monto = monto;
        }

        public abstract void pagar(double montoPagar);
    }

    public static class TarjetaCredito extends MedioPago {

        private String titular;
        private LocalDate fechaVencimiento;

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public LocalDate getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setFechaVencimiento(LocalDate fechaVencimiento) {
            this.fechaVencimiento = fechaVencimiento;
        }

        public TarjetaCredito(String identificacion, double monto, String titular, LocalDate fechaVencimiento) {
            super(identificacion, monto);
            this.titular = titular;
            this.fechaVencimiento = fechaVencimiento;
        }

        public void pagar(double montoPagar){

            String validacion = validar();

            if (validacion.equals("Valido")){

                if (montoPagar > getMonto()){
                    System.out.println("El monto a pagar supera el saldo disponible");
                }
                else{
                    setMonto(getMonto() - montoPagar);
                    System.out.println("¡Pago realizado!, Pagado -> " + montoPagar + " | Monto Restante -> " + getMonto());
                }

            }
            else{
                System.out.println(validacion);
            }

        }

        public String validar(){

            // La validacion deberia tambien verificar que la Tarjeta exista
            // y tenga los datos correctos (Base de Datos)

            if (fechaVencimiento.compareTo(LocalDate.now()) <= 0){
                return "Tarjeta Vencida";
            }
            else if (getMonto() <= 0){
                return "Tarjeta sin saldo disponible";
            }
            else {
                return "Valido";
            }
        }
    }

    public static class TransferenciaBancaria extends MedioPago{

        private String alias;
        private int numeroCuenta;

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(int numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public TransferenciaBancaria(String identificacion, double monto, String alias, int numeroCuenta) {
            super(identificacion, monto);
            this.alias = alias;
            this.numeroCuenta = numeroCuenta;
        }

        public void pagar(double montoPagar){

            String validacion = validar();

            if (validacion.equals("Valido")){

                if (montoPagar > getMonto()){
                    System.out.println("El monto a pagar supera el saldo disponible");
                }
                else{
                    setMonto(getMonto() - montoPagar);
                    System.out.println("¡Pago realizado!, Pagado -> " + montoPagar + " | Monto Restante -> " + getMonto());
                }

            }
            else{
                System.out.println(validacion);
            }

        }

        public String validar(){

            // La validacion deberia tambien verificar que la Cuenta exista
            // y tenga los datos correctos (Base de Datos)

            if (getMonto() <= 0){
                return "Cuenta sin saldo disponible";
            }
            else {
                return "Valido";
            }

        }
    }

    public static class CriptoMoneda extends MedioPago{

        private String nombreMoneda;

        public String getNombreMoneda() {
            return nombreMoneda;
        }

        public void setNombreMoneda(String nombreMoneda) {
            this.nombreMoneda = nombreMoneda;
        }

        public CriptoMoneda(String identificacion, double monto, String nombreMoneda) {
            super(identificacion, monto);
            this.nombreMoneda = nombreMoneda;
        }

        public void pagar(double montoPagar){

            String validacion = validar();

            if (validacion.equals("Valido")){

                if (montoPagar > getMonto()){
                    System.out.println("El monto a pagar supera el saldo disponible");
                }
                else{
                    setMonto(getMonto() - montoPagar);
                    System.out.println("¡Pago realizado!, Pagado -> " + montoPagar + " | Monto Restante -> " + getMonto());
                }

            }
            else{
                System.out.println(validacion);
            }

        }

        public String validar(){

            // La validacion deberia tambien verificar que el wallet
            // sea valido

            if (getMonto() <= 0){
                return "Wallet sin saldo disponible";
            }
            else {
                return "Valido";
            }
        }
    }
}
