/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_wall;

/**
 *
 * @author admin
 */
public class Cola {

    Node Head;
    Node fondo;
    
    public Cola(Node Head) {
        this.Head = Head;
    }
    
    public Cola() {
    }

    public Node getFondo() {
        return fondo;
    }

    public void setFondo(Node fondo) {
        this.fondo = fondo;
    }
    public Node getHead() {
        return Head;
    }

    public void setHead(Node Head) {
        this.Head = Head;
    }

    @Override
    public String toString() {
        return "Cola{" + "Head=" + Head + '}';
    }

    public void Queue(Object cola) {
        Node nuevo=new Node(cola);
        if (Head == null){
            Head=nuevo;
            fondo=nuevo;
        }else{
            fondo.setNext(nuevo);
            fondo=nuevo;
        }
    }
    public Object Dequeue() {
        if (Head !=null) {
            Node x=Head;
            Head=Head.getNext();
            return x.getPersona();
        }
        return null;
    }

}
