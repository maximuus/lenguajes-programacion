/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8.inputoutput;

import java.net.*;
import java.io.*;

public class MiPrimerConexion {
    public static void main(String[] args)throws Exception {
        //Primero vamos a usar una clase: URL
         URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
          HttpURLConnection con=(HttpURLConnection) url.openConnection(); //protocolo para conectar
           InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);//
        BufferedReader reader=new BufferedReader(isr);
        String lineaActual="NO HA LEIDO NADA";
        boolean encontrado=false;
        int milinea=0;
        while((lineaActual=reader.readLine())!=null){
            if(encontrado && milinea<=0) {
                //Vamos despedazar la linea.
                int indice=lineaActual.indexOf(">");
                int indice2=lineaActual.indexOf("</");
                String tempActual=lineaActual.substring(indice+1,indice2);
                
                
                
                
                
                System.out.println(tempActual);
                milinea++;
            }
        if(lineaActual.contains("Outside Temp")){
            encontrado=true;
            
            System.out.println("DATO ENCONTRADO");
        }
    
    
}
    }
    
}