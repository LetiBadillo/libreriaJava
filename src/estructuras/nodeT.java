/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**h
 *
 * @author ASUS
 */
public class nodeT <T>{
    int data;
    nodeT left;
    nodeT right;
    
    public nodeT(int data){
        this.data= data;
        this.left= null;
        this.right= null;
    }
    
    public nodeT(int data, nodeT left, nodeT right){
        this.data= data;
        this.left=null;
        this.right= null;
    }
    
    
}
