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
   private int costeErroresADN (String cadena1, String cadena2){
       int contador=0;
       for(int i=0; i<cadena1.length();i++){
       if(cadena1.charAt(i)=='-'|| cadena2.charAt(i)=='-'){
           contador++;
           contador++;
       } else if (cadena1.charAt(i)== 'A' && cadena2.charAt(i) !='T' 
               || cadena1.charAt(i)== 'C' && cadena2.charAt(i) !='G'
               || cadena1.charAt(i)== 'T' && cadena2.charAt(i) !='A'
               || cadena1.charAt(i)== 'G' && cadena2.charAt(i) !='C' )
           contador++;
           }
      return contador;
       
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
        System.out.println(e.costeErroresADN("ACGT", "TGCA"));
        System.out.println(e.costeErroresADN("A-C-G-T-ACGT", "TTGGCCAATGCA"));
        System.out.println(e.costeErroresADN("AAAAAAAA", "TTTATTTT"));
        System.out.println(e.costeErroresADN("GATTACA", "CTATT-T"));
        System.out.println(e.costeErroresADN("CAT-TAG-ACT", "GTATATCCAAA"));
        System.out.println(e.costeErroresADN("--------", "ACGTACGT"));
        System.out.println(e.costeErroresADN("TAATAA", "ATTATT"));
        System.out.println(e.costeErroresADN("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT"));
    }
    
}
