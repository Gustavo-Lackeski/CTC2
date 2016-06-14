
package ctc2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author G1511NEW
 */
public class graf {
    private static Integer m[][];//matriz de adjacencias
    static int custo; //guarda o custo total de um caminho
    static Integer caminho[]; //caminho de custo menor
    public graf(Integer mat[][]){
        m = mat;
        custo = 100000;//inicializa com infinito
        
    }
    public int getcusto(){
        return custo;
    }
    public Integer[] getcaminho(){
        return caminho;
    }
    //encontrar todas as permutacões    
    public static void permute(java.util.List<Integer> arr, int k){
        Integer temp[];
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i); 
        }
        if (k == arr.size() -1){
          //  System.out.println(java.util.Arrays.toString(arr.toArray()));
          calc(arr);
          
        }
    }
    static void calc(List<Integer> cam){
        Integer[] arra = cam.toArray(new Integer[cam.size()]);
        int c, i;
        c = 0;
        boolean falhou = false;
        int lenght;
        lenght = arra.length;
        if (m[0][arra[0]] != -1 && m[arra[lenght-1]][0] != -1){
            c = c + m[0][arra[0]] + m[arra[lenght-1]][0];
            for (i = 0; i<lenght-1; i++)
                if (m[arra[i]][arra[i+1]] == -1)
                    falhou = true;
                else
                    c = c + m[arra[i]][arra[i+1]];
            
        }
        else
            falhou = true;        
        /*if (m[0][arra[0]] == -1 || m[arra[0]][arra[1]] == -1 || m[arra[1]][arra[2]] == -1
                || m[arra[2]][arra[3]] == -1 || m[arra[3]][arra[4]] == -1 || m[arra[4]][0] == -1){
            c = 100000; //infinito
        
         }
           
        else{
            c = m[0][arra[0]] + m[arra[0]][arra[1]] + m[arra[1]][arra[2]] +
                 m[arra[2]][arra[3]] + m[arra[3]][arra[4]] + m[arra[4]][0];
        }*/
        if (c <= custo && !falhou){
            custo = c;
            caminho = arra;
             
        }
    }
        
    
    
}
