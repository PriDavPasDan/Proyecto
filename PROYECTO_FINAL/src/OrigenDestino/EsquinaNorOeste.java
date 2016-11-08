/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrigenDestino;

/**
 *
 * @author David
 */
public class EsquinaNorOeste {
    //CONSTRUCTOR
    public static int EsquinaNorOeste(int[] aOferta, int[] aDemanda, int[][]aCosto){
        //ARREGLO DE LA TABLA
        int[][] aTabla = new int[aOferta.length][aDemanda.length];
        //VARIABLE DEL COSTO
        int iCostoTotal = 0;
        
        //IMPRIMIR LA TABLA INICIAL
         System.out.println("TABLA INICIAL");
        for (int i = 0; i < aOferta.length; i++) {
            System.out.println("Oferta:" + aOferta[i]);
            for (int j = 0; j < aDemanda.length; j++) {
                System.out.print(" [" + aTabla[i][j] + "]");
                System.out.println("\t Demanda:" + aDemanda[j]);
            }
        }
        
        //PROCESO PARA ASIGNAR LOS DATOS
        System.out.println(" ");
        System.out.println("TABLA ASIGNANDO DATOS");
        for (int i = 0; i < aOferta.length; i++) {
            System.out.print("Oferta:" + aOferta[i]+"\t");
            for (int j = 0; j < aDemanda.length; j++) {
                //CONDICIONAL SI LA OFERTA ES MAYOR O IGUAL QUE LA DEMANDA
                if(aOferta[i] >= aDemanda[j]){
                    //LLENAR ESA POSICION DE LA TABLA CON EL VALOR DE DEMANDA
                    //YA QUE COMO LA OFERTA ES MAYOR, PODEMOS CUMPLIR LA DEMANDA
                    aTabla[i][j] = aDemanda[j];
                    //RESTARLE A LA OFERTA LA DEMANDA Y ACTUALIZAR EL VALOR DE OFERTA
                    aOferta[i] = aOferta[i] - aDemanda[j];
                    //AL CUMPLIR LA DEMANDA ESTA SE VUELVE 0
                    aDemanda[j] = 0;
                //CONDICIONAL SI LA OFERTA ES MENOR QUE LA DEMANDA    
                }else{
                    //LLENAR ESA POSICION DE LA TABLA CON EL VALOR DE OFERTA
                    //YA QUE COMO LA OFERTA ES MENOR, PODEMOS LLENAR UNA PARTE DE LA DEMANDA
                    aTabla[i][j] = aOferta[i];
                    //RESTARLE A LA DEMANDA LA OFERTA Y ACTUALIZAR EL VALOR DE DEMANDA
                    aDemanda[j] = aDemanda[j] - aOferta[i];
                    //AL AGOTARNOS LA OFERTA ESTA SE VUELVE 0
                    aOferta[i] = 0;
                }
                //IMPRIMIR LA TABLA LLENA
                System.out.print("[" + aTabla[i][j] + "]");
                System.out.print("\tDemanda:" + aDemanda[j] + "\t");
            }
            System.out.println(" ");
        }
        //CALCULAR EL COSTO A TRAVES DE LOS PRECIOS
        for (int i = 0; i <= 2; i++) {
             for (int j = 0; j <= 2; j++) {
                 iCostoTotal = iCostoTotal + aCosto[i][j]*aTabla[i][j];
             }
         }
        //IMPRIMIR EL COSTO TOTAL MINIMO
        System.out.println(" ");
        System.out.println("Costo Total: " + iCostoTotal);
        return iCostoTotal;
    }
}    
       
