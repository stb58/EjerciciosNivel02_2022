/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosnivel02;

/**
 *
 * @author sergi
 */
public class EjerciciosNivel02 {

   public boolean esEscaleraPalabras(char[][] listaPalabras){
       for(int i=0; i<listaPalabras.length-1;i++){
           int contador = 0;
           for(int j=0; j<listaPalabras[0].length; j++){
               if (listaPalabras[i][j] != listaPalabras [i + 1][j]){
                   contador++;
               }
           }
           if (contador != 1){ //si es distinto de uno devuelve falso por que significa que hay mas de una letra diferente
               return false;
           }
       }
       return true;
   } 
  
    public static void main(String[] args) {
        char [][] listaPalabras = {
            {'P', 'A', 'T', 'A'}, 
            {'P', 'A', 'T', 'O'}, 
            {'R', 'A', 'T', 'O'}, 
            {'R', 'A', 'M', 'O'}, 
            {'G', 'A', 'M', 'O'}, 
            {'G', 'A', 'T', 'O'}, 
            {'M', 'A', 'T', 'O'} 
        };
        EjerciciosNivel02 e = new EjerciciosNivel02();
        //System.out.println(e.esEscaleraPalabras(listaPalabras));
    }
    
}
