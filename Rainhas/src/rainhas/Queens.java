/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainhas;

/**
 *
 * @author danta
 */
public class Queens {
    int s[];
    int nr;
    int nsol;
    int col;

    public Queens(int n) {
        nr = n;
        s = new int[nr + 1];
        nsol = 0;
        col = 0;
    }
    
    public void escreveSolucao(){
        System.out.printf("Solução (%2d): (", nsol);
        for(int i =1; i <= nr - 1; i++){
            System.out.printf("%d,",s[i]);
        }
        System.out.printf("%d)\n",s[nr]);
    }
    
    public boolean atacada(int l, int c){
        int i;
        boolean emPerigo = false;
        
        i = 1;
        while(i < c && !emPerigo){
            emPerigo = (s[i] == l) || (Math.abs(s[i]-l) == Math.abs(i - c));
            i++;
        }
        return emPerigo;
    }
    
    public void colocaRainha(){
        col++;
        for(int lin= 1; lin <= nr; lin++){
            if(!atacada(lin,col)){
                s[col]=lin;
                if(col == nr){
                    nsol++;
                    escreveSolucao();
                }
                else{
                    colocaRainha();
                }
                s[col]=0;
            }
        }
        col--;
    }
    
}
