package arreglosdeberpoo;


import java.util.Scanner;

public class EjecutaConvertidor {
    public static void main(String[] args){

        int[] binario = new int[6];
        char[] cont;
        ///
        Convertidor conv = new Convertidor();
        ///

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero a Transformar");
        String num = entrada.nextLine();

        cont = num.toCharArray();

        for (int i = 0; i< cont.length; i++){
            binario[i] = Character.getNumericValue(cont[i]);
        }
        conv.setNumero(binario);
        System.out.println("El binario: "+ num + " pasa a decimal: "+ conv.convertirdecimal());
    }
}
