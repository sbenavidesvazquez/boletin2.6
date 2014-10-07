//% descontado en una compra, dando por teclado prezo tarifa e prezo pagado.
package boletin2.pkg6;

import java.util.Scanner;


public class Boletin26 {

    
    public static void main(String[] args) {
    float prezoTarifa,prezoPagado;
    
    System.out.print("Tarifa =");
    Scanner dato= new Scanner(System.in);
    prezoTarifa=dato.nextFloat();
    
    System.out.print("Pagado =");
    Scanner dato2= new Scanner(System.in);
    prezoPagado=dato2.nextFloat();
    
    System.out.print("% de descuento ="+ (prezoTarifa-prezoPagado)/prezoTarifa*100 +"%");
    }
    
}
