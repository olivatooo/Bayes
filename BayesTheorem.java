/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayestheorem;

/**
 *
 * @author olivato
 */
public class BayesTheorem {
    
    public static void main(String[] args) {
        Bayes b = new Bayes(0.01,0.99,0.8,0.096);
        System.out.println(b.getRealChance());
        System.out.println(b);
    }
    
}
