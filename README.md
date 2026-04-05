# Practica-Herencia-y-Polimorfismo-
Ejercicios para implementar Herencia y Polimorfismo con Clases Abstractas e Interfaces

1. Herencia básica
- Crea una clase Persona con atributos nombre y edad.
- Crea una clase Estudiante que herede de Persona y agregue legajo.
- Instancia objetos y muestra sus datos.

2. Sobrescritura de métodos
- Agrega un método presentarse() en Persona.
- Sobrescribe este método en Estudiante para incluir el legajo.

3. Polimorfismo simple
- Crea una lista de Persona que contenga tanto Persona como Estudiante.
- Recorre la lista y llama a presentarse(). Observa cómo se ejecuta la versión correcta según el tipo.

4. Clase abstracta
- Define una clase abstracta FiguraGeometrica con método abstracto calcularArea().
- Implementa Rectangulo y Circulo que hereden de ella.
- Crea un programa que calcule el área de varias figuras.

5. Interfaces básicas
- Define una interfaz Imprimible con método imprimir().
- Haz que Estudiante implemente Imprimible.
- Crea otra clase Profesor que también implemente la interfaz y prueba polimorfismo con ella.

6. Herencia + Interfaces
- Crea una clase abstracta Empleado con atributos comunes (nombre, salario).
- Define una interfaz Bonificable con método calcularBono().
- Implementa Programador y Gerente que hereden de Empleado y apliquen la interfaz con distintas reglas de bono.

7. Polimorfismo avanzado
- Crea un método procesarEmpleado(Empleado e) que imprima datos y calcule el bono.
- Pásale distintos tipos (Programador, Gerente) y observa cómo cambia el comportamiento.

8. Jerarquía más compleja
- Crea una clase abstracta Animal con método hacerSonido().
- Implementa Perro, Gato, Pajaro.
- Haz que todos implementen también una interfaz Mascota con método jugar().
- Usa polimorfismo para recorrer una lista de animales y ejecutar ambos métodos.

9. Combinación de abstracción e interfaces
- Diseña una clase abstracta Vehiculo con método mover().
- Crea Auto y Bicicleta.
- Define una interfaz Recargable con método recargar().
- Haz que AutoElectrico implemente Recargable.
- Simula un sistema de transporte con distintos vehículos.

10. Mini-sistema con polimorfismo múltiple
- Diseña un sistema de pagos:
- Clase abstracta MedioPago con método pagar(double monto).
- Implementaciones: TarjetaCredito, TransferenciaBancaria, CriptoMoneda.
- Interfaz Validable con método validar().
- Crea una lista de MedioPago y procesa pagos con validación y polimorfismo.


RECOMENDACION: Crear clases aparte para los ejercicios y ejecutar todo en el Main de la carpeta de Ejercicios

-- Podes revisar mis soluciones en la carpeta de soluciones