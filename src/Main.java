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
            } else{
                System.out.println("No Habilitada/o.");
            }
        //2. Aprobación con condiciones: Declara una variable con la nota y otra booleana que indique si
        //asistió a clases. Muestra 'Aprobado' solo si la nota es mayor o igual a 60 y asistió a clases.

        int nota = 70;
        boolean presencial = true;

        if (nota >= 60) {
            System.out.println("Asistió a clases.");
        }else{
            System.out.println("No assistió a clases.");
        }

    }
}