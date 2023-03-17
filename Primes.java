/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primes;

import java.util.Scanner;
/**
 *
 * @author yeixongec
 */
public class getPrimeBetween {

    /**
     * @param number
     * @param args the command line arguments
     * @return 
     */
    
    private int startNumber;
    private int endNumber;
    
    public getPrimeBetween (int startNumber, int endNumber)
            
    {
        this.startNumber=startNumber;
        this.endNumber=endNumber;
        arrangePair(startNumber,endNumber);
        printPrime();   
    }
    
    public void arrangePair(int strt, int fnl) // strt = start & fnl = final
    {
        
        if(strt>fnl)
        {
            int anc = strt;  //anc = ancillary
            this.startNumber = fnl;
            this.endNumber = anc;
        }
       
    }
    
    public boolean getPrime(int number)
    {
        int coun = 0;  //coun = counter
        
            if(number==1 || number==0)
            {
                return false;
            }
            
            for(int i=1;i<=number;i++)
                {
                    if(number%i==0)
                    { 
                        coun++;
                    }
                    if(coun>2)
                    {
                        return false;
                    }
                }
        
        return true;
    }
    
    public void printPrime()
    
    {
        
        int numberPrimes=0; 
        int sumPrimes=0;
        
            for(int i=this.startNumber;i<=this.endNumber;i++)
            {
                if(getPrime(i)==true)
                {
                    numberPrimes++;
                    System.out.println("Prime #"+numberPrimes+":"+i);
                    sumPrimes+=i;
                }
            }
        
        System.out.println("The number of prime between "+this.startNumber+
                " and "+this.endNumber+" is: "+numberPrimes+"\n"+"Their sum is: "+sumPrimes);
     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Type two values, first the fewer and later the large (Anyway, they will be ordered):");
        int valueA = getNumber.nextInt();
        int valueB = getNumber.nextInt();
        getPrimeBetween tryOne = new getPrimeBetween(valueA,valueB);
    }
    
}
