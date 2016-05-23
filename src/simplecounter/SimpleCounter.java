/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecounter;

/**
 *
 * @author Quang Quang
 */
public class SimpleCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long now = System.currentTimeMillis();
        for(long i=0 ; i<200;++i){
            
            
            System.out.print(""+i+" ");
            
        }
        long time = System.currentTimeMillis()-now;
           
        System.out.print("\nit take : "+String.valueOf(time)+" ms to count");
        
    }
    
}
