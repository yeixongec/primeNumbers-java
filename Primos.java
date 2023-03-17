/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author yeixongec
 */
public class Primos {

    /**
     * @param numero
     * @param args the command line arguments
     * @return 
     */
    private int limiteInferior;
    private int limiteSuperior;
    
    public Primos (int limiteInferior, int limiteSuperior)
            
    {
        this.limiteInferior=limiteInferior;
        this.limiteSuperior=limiteSuperior;
        ordenarPar(limiteInferior,limiteSuperior);
        imprimirPrimos();   
    }
    
    public void ordenarPar(int ini, int fin)
    {
        
        if(ini>fin)
        {
            int aux = ini;
            this.limiteInferior = fin;
            this.limiteSuperior = aux;
        }
       
    }
    
    public boolean encontrarPrimos(int numero)
    {
        int cont = 0;
        
        if(numero==1 || numero==0)
        {
            return false;
        }
        
        for(int i=1;i<=numero;i++)
        {
            if(numero%i==0)
            { 
                cont++;
            }
            if(cont>2)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public void imprimirPrimos()
    {
        
        int cantidadPrimos=0;
        int sumaPrimos=0;
        
        for(int i=this.limiteInferior;i<=this.limiteSuperior;i++)
        {
            if(encontrarPrimos(i)==true)
            {
                cantidadPrimos++;
                System.out.println("Primo #"+cantidadPrimos+":"+i);
                sumaPrimos+=i;
            }
        }
        
        System.out.println("La cantidad de primos entre "+this.limiteInferior+
                " y "+this.limiteSuperior+" es: "+cantidadPrimos+"\n"+"Su suma es: "+sumaPrimos);
     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obtenerEntero = new Scanner(System.in);
        System.out.println("Digite dos valores, primero el menor y luego el mayor (De todas formas seran reordenados):");
        int valorA = obtenerEntero.nextInt();
        int valorB = obtenerEntero.nextInt();
        Primos prueba1 = new Primos(valorA,valorB);
    }
    
}
