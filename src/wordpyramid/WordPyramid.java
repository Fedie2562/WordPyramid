/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordpyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input
        String word = JOptionPane.showInputDialog("Enter your word");
        //Print the original word
        System.out.println(word);
        remover(word);
    }
    public static String remover(String w){
        // The recursion process
        if(w.length()==1||w.length()==2){
            return w;
        }else{
            w = w.substring(1,w.length()-1);
            System.out.println(w);
            return remover(w);
        }
    }
}
