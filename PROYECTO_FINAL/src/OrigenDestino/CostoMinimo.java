/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrigenDestino;

public class CostoMinimo {
    public static int CostoMinimo(int[] aOferta, int[] aDemanda, int[][]aCosto){
        //ARREGLO TABLA
        int[][] aTabla = new int[aOferta.length][aDemanda.length];
        //VARIABLE COSTO TOTAL
        int iCostoTotal = 0;
        //VARIABLE ENCONTRAR EL COSTO MINIMO EN LA TABLA
        int aMenor = aCosto[0][0];
        //VARIABLE DE LA FILA
        int iF = 0;
        //VARIABLE DE LA COLUMNA
        int iC = 0;
        //VARIABLES SI LA FILA Y COLUMNA ESTAN SATISFECHAS (LLENAS)
        boolean bFLlena = false;
        boolean bCLlena = false;
        //CICLO
        for (int i = 0; i < aOferta.length; i++) {
            for (int j = 0; j < aDemanda.length; j++) {
                //CONDICIONAL SI MENOR ES MAYOR A COSTO
                if(aMenor > aCosto[i][j]){
                    //SI ES ASI, MENOR SERA IGUAL A COSTO
                    aMenor = aCosto[i][j];
                    //LAS VARIABLES TOMARAN LOS VALORES DE i Y j
                    iF = i;
                    iC = j;
                }
            }
        }
        //CONDICIONAL, MIENTRAS COLUMNA SEA DIFERNETE A VERDADERO
        while (bCLlena != true) {
            //CONDICIONAL, SI LA OFERTA ES MAYOR O IGUAL A LA DEMANDA
            if(aOferta[iF] >= aDemanda[iC]){
                //LA POSICION EN LA TABLA SE LLENARA CON LA DEMANDA
                aTabla[iF][iC] = aDemanda[iC];
                //SE ACTUALIZARA EL VALOR DE OFERTA
                aOferta[iF] = aOferta[iF] - aDemanda[iC];
                //YA QUE LA DEMANDA SE CUMPLIO ESTA SERA 0
                aDemanda[iC] = 0;
            }
            //CONDICIONAL, SI LA OFERTA ES MENOR A LA DEMANDA
            else{
                //LA POSICION EN LA TABAL SE LLENARA CON LA OFERTA
                aTabla[iF][iC] = aOferta[iF];
                //SE ACTUALIZARA LA DEMANDA
                aDemanda[iC] = aDemanda[iC] - aOferta[iF];
                //LA OFERTA SERA 0, PORQUE SE AGOTO
                aOferta[iF] = 0;
            }
            //ENCONTRAR LA MANERA DE IMPRIMIR LA TABLA Y TODOS LOS VALORES
            
            //ENCONTRAR EL SIGUIENTE MENOR COSTO DE ENVIO
        }
        return iCostoTotal;
    }
}
