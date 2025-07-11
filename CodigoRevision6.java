import java.util.Scanner;//faltaba importar el Scanner

public class CodigoRevision6 {

    public static void main(String[] args) {//no estaba la funcion de main
        int[] n = new int[20];

        // Generar números aleatorios entre 20 y 400
        for (int i = 0; i < 20; i++) { //correcion del "i++"
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");//corregi el System.out.print en ligar de system.print
        }

        Scanner scanner = new Scanner(System.in);
        //se una un scanner en lugar de system.console

        System.out.println("\n¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = scanner.nextInt(); //usamos scanner para leer el numero

        int multiplo = (opcion == 1) ? 5 : 7;// corregi la logica condición ? valor_si_verdadero : valor_si_falso

        // Mostrar los números resaltados
        for (int e : n) {
            //uso correcto del for each
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");//imprime en corchetes si es multiplo
            } else {
                System.out.print(e + " ");//se corrigue el System.out.print porque estaba System.in
            }
        }
    }
}


