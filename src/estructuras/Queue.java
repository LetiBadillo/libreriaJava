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
public class Queue <T> {
    //Atributos
    private nodeClass first;
    private nodeClass last;
    private int size;

    //Constructos
    public Queue (){
        this.first= null;
        this.last= null;
        this.size= 0;
    }
    
    public Queue(T data){
        insertLast(data);
    }
    
    //Métodos 
    public void insertLast(T data){
        nodeClass node = new nodeClass(data);
        if(isEmpty()){
            this.first = node;
            this.last = node;
            
        }else {
            //Analizar
            node.setNext(node);
            last = node;
           
        }
        ++this.size;
    }
 

  public T deleteFirst(){
        nodeClass temp;
        if (!isEmpty()){
            if (size==1){
                temp=this.first;
                this.first = this.last = null;
                size=0;
            }else{
                temp=last;
                while(temp.getNext()!=first){
                    temp=temp.getNext();
                }
                first = temp;
                temp = first.getNext();
                first.setNext(null);
                --size;
            }
           return (T) temp.getData();
        }
        return null;
    }
  public void setEmpty(){
        this.first = null;
        this.last = null;
        this.size=0;
    }
            
    public boolean isEmpty(){
        return first==null;
    }
    public Object getFirst() {
        return first.getData().toString();
    }

    public int getSize() {
        return size;
    }

    public void setFirst(nodeClass first) {
        this.first = first;
    }

    public void setLast(nodeClass last) {
        this.last = last;
    }

    public void setSize(int size) {
        this.size = size;
    }
 //  vaciarfila
    
}
