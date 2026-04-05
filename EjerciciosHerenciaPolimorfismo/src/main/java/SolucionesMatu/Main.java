package SolucionesMatu;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ejercicio 1

        System.out.println("Ejercicio 1");

        Ejercicio123.Estudiante estudiante = new Ejercicio123.Estudiante("Mateo", 23, "114324");

        System.out.println(estudiante.presentarse());

        // Ejercicio 2

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 2");

        System.out.println(estudiante.presentarse());

        // Ejercicio 3

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 3");

        List<Ejercicio123.Persona> personas = new ArrayList<>();

        personas.add(new Ejercicio123.Persona("Javier", 18));
        personas.add(new Ejercicio123.Estudiante("Gustavo", 20, "482358"));

        personas.forEach(persona -> System.out.println(persona.presentarse()));

        // Ejercicio 4

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 4");

        Ejercicio4.Rectangulo rectangulo = new Ejercicio4.Rectangulo(20, 10);
        Ejercicio4.Circulo circulo = new Ejercicio4.Circulo(15);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Area Rectangulo: " + df.format(rectangulo.calcularArea()));
        System.out.println("Area Circulo: " + df.format(circulo.calcularArea()));

        // Ejercicio 5

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 5");

        Ejercicio5.Profesor profesor = new Ejercicio5.Profesor("Cristian", 43, "14013A");
        Ejercicio123.Estudiante estudiante2 = new Ejercicio123.Estudiante("Lucas", 19, "140103");

        profesor.imprimir();
        estudiante2.imprimir();

        // Ejercicio 6 y 7

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 6 y 7");

        Ejercicio6y7.Programador programador = new Ejercicio6y7.Programador("Leonardo", 1800000);
        Ejercicio6y7.Gerente gerente = new Ejercicio6y7.Gerente("Pilar", 2000000);

        System.out.println(Ejercicio6y7.procesarEmpleado(programador));
        System.out.println(Ejercicio6y7.procesarEmpleado(gerente));

        // Ejercicio 8

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 8");

        List<Ejercicio8.Animal> animales = new ArrayList<>();

        animales.add(new Ejercicio8.Perro("Lola", "Obejero Aleman"));
        animales.add(new Ejercicio8.Gato("Quipuwe", "Gata Tricolor"));
        animales.add(new Ejercicio8.Pajaro("Gordin", "Sorzal"));

        for (Ejercicio8.Animal a : animales){
            System.out.println("Mascota: " + a.getNombre() + ", Raza: " + a.getRaza());
            a.hacerSonido();
            a.jugar();
        }

        // Ejercicio 9

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 9");

        Ejercicio9.Bicicleta bici = new Ejercicio9.Bicicleta("Cualquiera", "2015", 50);
        Ejercicio9.AutoElectrico autoElectrico = new Ejercicio9.AutoElectrico("Audi", "2022", 75);

        bici.mover(8.10);
        autoElectrico.mover(20.80);

        bici.recargar(2);
        autoElectrico.recargar(40);

        // Ejercicio 10

        System.out.println("/////////////////////////////////");
        System.out.println("Ejercicio 10");

        Ejercicio10.TarjetaCredito tarjeta = new Ejercicio10.TarjetaCredito(
                "TARJ-001",
                1000.0,
                "Mateo",
                LocalDate.of(2027, 12, 31)
        );
        Ejercicio10.TransferenciaBancaria cuenta = new Ejercicio10.TransferenciaBancaria(
                "CUENTA-001",
                5000.0,
                "mateo.alias",
                123456
        );
        Ejercicio10.CriptoMoneda wallet = new Ejercicio10.CriptoMoneda(
                "WALLET-001",
                0.05,
                "Bitcoin"
        );

        System.out.println("=== Pago con Tarjeta ===");
        tarjeta.pagar(200.0);

        System.out.println("=== Pago con Cuenta Bancaria ===");
        cuenta.pagar(1000.0);

        System.out.println("=== Pago con Criptomoneda ===");
        wallet.pagar(0.01);
    }
}