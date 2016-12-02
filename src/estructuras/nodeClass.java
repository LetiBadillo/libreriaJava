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
public class nodeClass <T>{
    //Atributes
    private  T data;
    nodeClass next;
    //Constructor
    public nodeClass (T data){
        this.data= data;
        this.next = null;
    }
    
    public void setData(T data){
        this.data = data;
    }
    public void setNext(nodeClass next){
        this.next=next;
    }
    public T getData(){
        return this.data;
    }
    
    public nodeClass getNext(){
        return this.next;
    }
}
