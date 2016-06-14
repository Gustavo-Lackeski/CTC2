package ctc2; 
import java.util.List; 
import java.util.ArrayList; 

import java.util.Random;
import java.util.Scanner;

public class Graph { 
    public final int NUMERO_DE_NODOS; 
    public final int OO = 2147483647;//infinito 
    private Integer[][]matrizDePesos; 
         
    public Graph(int numeroDeNodos, int numeroDeArestas)throws Exception{ 
         
        if(numeroDeNodos <= 0) 
            throw new Exception("o numero de nodos deve ser maior que 0"); 
        NUMERO_DE_NODOS = numeroDeNodos;     
        try{ 
            setMatrizDePesos(criaMatrizInt(numeroDeNodos,-1, numeroDeArestas));                 
        }catch(Exception ex){ 
            if(ex.getMessage() == null) 
                  System.out.println("Ocorreu um erro de "+ex+" no construtor"); 
            else 
                System.out.println(ex.getMessage()); 
        } 
         
    }     
     
 
    public Integer[][] criaMatrizInt(int tamanho, Integer valorPadrao, int arestas)throws Exception{     
    	
    	Random p = new Random();
    //	int aux = arestas;  ((tamanho*(tamanho-1))/2 - 
    	int k = ((tamanho*(tamanho-1))/2 -arestas);
    			System.out.printf("k = "+k+" \n\n ");
    			
        if(tamanho <=1 ) 
            throw new Exception("o tamanho deve ser maior que 1"); 
        
        
        Integer matriz[][] = new Integer[tamanho+1][]; 
        try{ 
            for(int i = 0 ; i < tamanho ; i++){ 
                matriz[i] = new Integer[tamanho+1];             
                for(int j = 0 ; j < tamanho ; j++){ 
                	if(i==j) matriz[i][j] = -1;
                	else
                	if(i<j)
                    matriz[i][j] = p.nextInt(10)+1;
                	else
                    matriz[i][j] = matriz[j][i];
                }
            } 
            
            while(k > 0){  
           	 for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 1){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 2){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 3){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 4){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 5){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 6){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 7){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 8){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 9){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
           	for(int c = 0 ; c < tamanho ; c++){
                for(int l = 0 ; l < tamanho ; l++)
                	if(c < l && matriz[c][l] == 10){
                    matriz[c][l] = -1;
                    matriz[l][c] = -1;
                    k--;
                    if( k <= 0) break;
                	}if( k <= 0) break;
           	 }if( k <= 0) break;
           	 
            }
            
            for(int i = 0 ; i < tamanho ; i++){           
                for(int j = 0 ; j < tamanho ; j++){ 
                	if(i==j) matriz[i][j] = -1;
                	else
                		if(i<j && matriz[i][j] != -1)
                			matriz[i][j] = p.nextInt(10)+1;
                		else
                			if(i>j && matriz[i][j] != -1)
                			matriz[i][j] = matriz[j][i];
                }
            } 
            
        }catch(Exception ex){ 
            if(ex.getMessage() == null) 
                  System.out.println("Ocorreu um erro de "+ex+" em criaMatrizInt"); 
            else 
                System.out.println("Erro ao criar a matriz"); 
        } 
        return matriz; 
    } 
     
    public void printMatriz(Integer matriz[][])throws Exception{ 
         
        if(matriz == null)  
            throw new Exception("a matriz e nula");  
         
        if(matriz[0] == null)  
            throw new Exception("a matriz nao foi inicializada"); 
         
            int tamanho = getNUMERO_DE_NODOS(); 
         
            for(int i = 0 ; i < tamanho ; i++){ 
                for(int j = 0 ; j < tamanho ; j++) 
                    System.out.printf("["+matriz[i][j]+"] "); 
                System.out.printf("\n"); 
            }         
    } 
     
    public void insertArc(int A, int B, int peso)throws Exception{ 
        try{ 
            if(A < 0 || B < 0  
                    || A > getNUMERO_DE_NODOS()             
                    || B > getNUMERO_DE_NODOS()) 
                throw new Exception("um dos vertices sao invalidos"); 
            if(peso == 0) 
                throw new Exception("nao eh permitido peso negativo"); 
 
            matrizDePesos[A][B] = peso;     
        }catch(Exception ex){ 
            if(ex.getMessage() == null) 
                System.out.println("Ocorreu um erro de "+ex+" insertArc"); 
            else 
                System.out.println("Erro na insecao de arco"); 
        } 
    } 
     
    public Integer[][] getMatrizDePesos() {         
        return this.matrizDePesos; 
    } 
 
    public void setMatrizDePesos(Integer[][] pesos) {         
        this.matrizDePesos = pesos;         
    } 
 
    public int getNUMERO_DE_NODOS() { 
        return NUMERO_DE_NODOS; 
    } 
      
    
}