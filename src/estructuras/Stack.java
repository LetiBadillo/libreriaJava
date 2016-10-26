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
public class Stack <T> {
    private static nodeClass top;
    private static int size;
    //Constructor
    public Stack(){
        this.top= null;
        this.size=0;
    }
    //return stack top
    public Object getTop() {
        return top.getData().toString();
    }
    //tamaño pila
    public int getSize() {
        return size;
    }
//Si está vacía
    public boolean isEmpty(){
        return top==null;
    }
    
//inserta en las cosas
    
  public void push(T data){
     nodeClass node = new nodeClass(data);
     
     if(isEmpty()){ //Si la pila está vacía
         top = node;
     }else{
       node.setNext(top);
       top=node;
     }
     ++size;
  }
  
  public void pop(){
      if (!isEmpty()){
          top= top.getNext();
          --size;
   
      }else{
          System.out.println("Ya está vacía jij");
      }
  }
  
  public void showStack(){
        if(!isEmpty()){
        nodeClass aux = top;
        do {
            System.out.println(aux.getData());
            aux=aux.getNext();
        }while (aux!= null);
      }
    }

}
