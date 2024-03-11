/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ever.ptecnic;

/**
 *
 * @author everf
 */
import java.util.Arrays;
import java.util.Scanner;

public class PTecnic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las deudas separadas por espacio: ");
        String[] deudasStr = scanner.nextLine().split(" ");
        int[] deudas = new int[deudasStr.length];
        for (int i = 0; i < deudasStr.length; i++) {
            deudas[i] = Integer.parseInt(deudasStr[i]);
        }
        scanner.close();
        System.out.println("El número de día necesarios para pagar cada deuda es de : ");
        System.out.println(Arrays.toString(diasParaPagar(deudas)));
    }

    public static int[] diasParaPagar(int[] deudas) {
        int[] diasPorDeuda = new int[deudas.length];
        for (int i = 0; i < deudas.length; i++) {
            int total = 0;
            int dias = 0;
            while (total < deudas[i]) {
                total = (int) Math.pow(2, dias) * 2 - 1;
                dias++;
            }
            diasPorDeuda[i] = dias;
        }
        return diasPorDeuda;
    }
}
