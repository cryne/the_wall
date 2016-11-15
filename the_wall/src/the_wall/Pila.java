/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_wall;

/**
 *
 * @author Romero
 */
public class Pila {
    Node Head;

    public Pila() {
    }

    public Pila(Node Head) {
        this.Head = Head;
    }

    public Node getHead() {
        return Head;
    }

    public void setHead(Node Head) {
        this.Head = Head;
    }


    @Override
    public String toString() {
        return "Pila{" + "Head=" + Head +'}';
    }
    
    public void push(Object cola) {
        Node nuevo=new Node(cola);
        if (Head== null){
            Head=nuevo;
        }
        Node x=Head;
        Head=nuevo;
        Head.setNext(x);
    }
    public Object pop() {
        if (Head !=null) {
            Node x=Head;
            Head=Head.getNext();
            return x.getPersona();
        }
        return null;
    }
}
