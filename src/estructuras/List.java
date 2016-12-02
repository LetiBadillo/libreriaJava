/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;
import java.util.Scanner;
import java.util.Scanner;

/**
 *
 
 */
public class List <T>{
    private nodeClass first;
    private nodeClass last;
    private nodeClass move;
    private int elements;
    
    /**
     * Constructor
     */
    public List (){
        this.first=null;
        this.last=null;
    }
    
    /**
     * ¿Está la lista vacía?
     * @return true 
     */
    public boolean isEmpty(){
        return this.first==null;
    }
    
    /**
     * Inserta un elemento al inicio de la lista.
     * @param data 
     */
    public void insertFirst(T data){
        nodeClass <T> nodo = new nodeClass (data);
        if (isEmpty()){
            this.first = nodo;
            this.last = nodo;
        }else{
            nodo.next=this.first;
            this.first=nodo;
        }
        this.elements ++;
    }
    
    public void insert(T data){
        nodeClass <T> nodo = new nodeClass (data);
        if (isEmpty()){
            this.last = nodo;
            this.first= nodo;
        }else{
            this.last.next = nodo;
            last=nodo;
        }
        this.elements ++;
    }
    
    public int getElements(){
        return this.elements;
    }
    
    public boolean delete (T data){
        if(!isEmpty()){
            setFirst();
            if (move.getData().equals(data)){
                return deleteFirst();
            }else{
                while (!move.next.getData().equals(data)){
                    if (move.next!=null){
                    keepMoving();
                    }else{
                        return false;
                    }
                }
                move.next=move.next.next;
                return true;
            }
        }else{
            return false;
        }
    }
    
    public void emptyList(){
        System.out.print("\033[31mAll the elements will disapear. Are you sure?(Y/N) ");
        Scanner e = new Scanner(System.in);
        String r = e.nextLine();
        if (r.equals("Y") || r.equals("y")){
            this.first=this.last=this.move=null;
            this.elements=0;
            System.out.println("\033[31mDone");
        }
    }
    
    
    public boolean deleteFirst(){
        if (!isEmpty()){
            this.first=this.first.next;
            return true;
        }else return false;
    }
    
    
    public boolean deleteLast(){
        if (!isEmpty()){
            setFirst();
            while(!this.move.next.equals(this.last)){
                keepMoving();
            }
            last = this.move;
            last.next = null;
            return true;
        }else return false;
    }
    
    
    public T fetch(T data){
        if(!isEmpty()){
            if (last.getData().equals(data)){
                
                return (T) move.getData();
            }else{
                setFirst();
                do{
                    if (!move.getData().equals(data)){
                         keepMoving();
                    }else{
                        return (T) move.getData();
                    } 
                }while(move != last);
            }
        }
        return null;
    }
    
    
    public void setFirst(){
        move = this.first;
    }
    
    
    public boolean isFirst(){
        return move == this.first;
    }
    
    
    public void setLast(){
        move = this.last;
    }
    
    
    public boolean isLast (){
        return move == this.last;
    }
    
    
    public void keepMoving(){
        move = move.next;
    }
    
    
    public T getMove(){
        return (T) this.move.getData();
    }
    
    @Override
    public String toString(){
        if (!isEmpty()){
            String s="";
            setFirst();
            while(move!=null){
                s += (T) getMove() + "->";
                
                keepMoving();
            }
            return s+="null";
        }
        else return "Lista vacía";
    }
}