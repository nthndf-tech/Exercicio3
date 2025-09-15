//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Declara una variable saldo y otra booleana que indique si la persona está habilitada para
        //realizar la transacción. Muestra 'Puede hacerla' si tiene saldo y además está habilitada

        int saldo = 56;
        boolean habilitado = true;

        if (saldo >= 1) {
            System.out.println("Habilitada/o.");
        } else {
            System.out.println("No Habilitada/o.");
        }
        //2. Aprobación con condiciones: Declara una variable con la nota y otra booleana que indique si
        //asistió a clases. Muestra 'Aprobado' solo si la nota es mayor o igual a 60 y asistió a clases.

        int nota = 40;
        boolean presencial = true;

        if (nota >= 60) {
            System.out.println("Asistió a clases.");
        } else {
            System.out.println("No assistió a clases.");
        }
        //3. Rango válido: Declara una variable entera. Verifica si está entre 50 y 100 inclusive. Muestra
        //'Dentro del rango' o 'Fuera del rango'

        int var = 80;

        if (var >= 50 && var <= 100) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango.");
        }
        //4. Usuario y contraseña: Declara dos variables String, una para usuario y otra para contraseña. Si
        //usuario es 'admin' y contraseña es '1234', muestra 'Acceso permitido', en caso contrario 'Acceso
        //denegado'

        String usuario = "admin";
        String contrasena = "1234";

        if (usuario == "admin" && contrasena == "1234") {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        //5. Compra con descuento adicional: Declara una variable con el precio y otra booleana que indique
        //si tiene tarjeta de cliente. Si el precio es mayor a 200 aplica un 15% de descuento, si además tiene
        //tarjeta aplica un 5% extra.

        double precio = 100;
        boolean poseeTarjeta = true;

        if (precio > 200 && poseeTarjeta == true) {
            System.out.println("El nuevo precio es " + precio * 0.80);
        } else if (precio > 200) {
            System.out.println("El nuevo precio es " + precio * 0.75);
        } else {
            System.out.println("El precio es " + precio);

        }

        //6. Categoría de edad: Declara una variable con la edad de una persona. Si es menor de 12
        //muestra 'Niño', si está entre 12 y 17 'Adolescente', entre 18 y 64 'Adulto', y 65 o más 'Adulto
        //mayor'.

        int edad = 100;

        if (edad < 12) {
            System.out.println("Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Adulto.");
        } else System.out.println("Adulto mayor.");

        //7. Validar número par y múltiplo de 5: Declara un número entero. Verifica si es par y además
        // múltiplo de 5. Muestra el mensaje correspondiente.

        int num = 8;

        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println(num + " es par y multiplo de 5.");
        } else if (num % 2 == 0) {
            System.out.println(num + " es par.");
        }

        //8. Contraseña segura: Declara una variable String con una contraseña. Si la longitud es mayor o
        //igual a 8 y contiene el carácter '@' muestra 'Contraseña segura', en caso contrario 'Contraseña
        //insegura'.

        String contrasenha = "126555534@";

        if (contrasenha.length() >= 8 && contrasenha.contains("@")){
            System.out.println("Contraseña segura.");
        } else {
                System.out.println("Contraseña insegura.");
            }

        //9. Evaluar dos números: Declara dos números enteros. Si ambos son positivos muestra 'Ambos
        //positivos', si ambos son negativos 'Ambos negativos', en otro caso 'Son diferentes'.

        int num1 = 2;
        int num2 = 10;

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos son positivos.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Ambos son negativos.");
        }
             else {
                System.out.println("son diferentes.");
            }

        //10. Operador ternario: Declara una variable entera con una edad. Usa el operador ternario para
        //guardar en una variable String 'Mayor de edad' o 'Menor de edad' según corresponda, y muéstralo

        int idade = 18;
             String resultado = (idade >= 18) ? "Mayor de edad" : "Menor de edad";
             System.out.println(resultado);

    }
}