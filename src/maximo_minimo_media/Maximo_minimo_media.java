/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximo_minimo_media;

/**
 *
 * @author sergio
 */
public class Maximo_minimo_media {

    public static int maximo (int x, int y)
{
   int maximo;
   maximo=-500;       
    if(x>maximo)
        maximo=x;
    if(y>maximo)
        maximo=y;
        return maximo;
 }
public static int minimo (int x, int y)
{
   int minimo;
   
   minimo=500;       
    if(x<minimo)
        minimo=x;
    if(y<minimo)
        minimo=y;
    
    return minimo;
}

public  int media( int w, int x, int y, int z)
{
        int media;
        media=(w+x+y+z)/4;
        return media;
}

    public static void main(String[] args)
    {
        
    }
}