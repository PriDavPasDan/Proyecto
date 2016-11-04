/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoSimplex;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Equipo
 */
public class MetodoSimplex {
    
    //ATRIBUTOS DE NUESTRO METODO SIMPLEX
    public static int iPosicionEnSubStringAnteM; //Posicion del número SubString que esta delante de la M e
    public static boolean bTodosMenores=false;
    public static int iColumnaMayor, iFilaMenor, iNumeroTablones=1;
    public static double dPivote;
    
    
    //METODO PARA CALCULAR Zj
    public static void calcularZj(DefaultTableModel modeloParaSolucion){//DefaultTableModel es una clase que 
        //implementa TableModel que contiene todos los métodos necesarios para modificar datos en su interior:
        //añadir filas o columnas y darle a cada columna el valor que se desee.
       
        //ATRIBUTOS DEL METODO CALCULAR Z
        int iFila = modeloParaSolucion.getRowCount();//Devuelve el número de filas en esta tabla de datos.
        int iColumna = modeloParaSolucion.getColumnCount();//Devuelve el número de columnas en la tabla de datos
        double dSumModSolu=0.0, sumaNumeros=0.0;
        double dSB,dX;
        String sValor;
        
       
    }
    //METODO PARA CALCULAR QUE CONTIENE A M
    
    /*Una variable artificial es un truco matemático para convertir inecuaciones
    ">=" en ecuaciones, o cuando aparecen igualdades en el problema original, 
    la característica principal de estas variables es que no deben formar parte 
    de la solución, dado que no representan recursos. El objetivo fundamental de 
    estas variables es la formación de la matriz identidad.*/
    public static boolean contieneM(String valor){
        String sVal;
        for (int i = 0; i < valor.length(); i++) {
            sVal=String.valueOf(valor.charAt(i));
            if(sVal.equalsIgnoreCase("M"))
               return true;            
        }
        return false;
    }
    
    
}
