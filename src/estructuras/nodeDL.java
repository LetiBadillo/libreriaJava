/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author ASUS
 */
public class nodeDL<T> {
     T data;
    nodeDL next;
    nodeDL prev;
    
    public nodeDL(T data){
        this.data= data;
        this.next=null;
        this.prev=null;
    }
    
}