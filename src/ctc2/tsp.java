/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctc2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author G1511NEW
 */
public class tsp {    
    public static void main (String args[]){         
        try{ 
        	
        	int n,m;
                n = 6; //NUMERO DE VERTICES
                m = 10; //NUMERO DE ARESTAS
                Graph teste = new Graph(n, m);                
                teste.printMatriz(teste.getMatrizDePesos()); 
                graf g = new graf(teste.getMatrizDePesos());
                List<Integer> list = new ArrayList<Integer>();
                int i;
                for (i = 1; i < n; i++)
                    list.add(i);
                graf.permute(list, 0); //java.util.Arrays.asList(1,2,3,4,5)
                System.out.println("Custo " + g.getcusto());
                System.out.println("Melhor caminho: 0 " +Arrays.toString(g.getcaminho()) + " 0");
        }catch(Exception ex){ 
            if(ex.getMessage() == null) 
                  System.out.println("Ocorreu um erro de "+ex+" no main"); 
            else  
                System.out.println(ex.getMessage()); 
        } 
    //  
    
      
    } 
    
}
