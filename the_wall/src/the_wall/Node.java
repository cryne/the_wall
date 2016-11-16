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
public class Node {
    
    Mexicano Persona;
    Pila pila;
    Node next;

    public Node(Mexicano Persona, Node next) {
        this.Persona = Persona;
        this.next = next;
    }

    public Node(Mexicano Persona, Pila pila, Node next) {
        this.Persona = Persona;
        this.pila = pila;
        this.next = next;
    }

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }
    
    public Node(Object mex) {
        Mexicano persona=(Mexicano)mex;
        this.Persona = Persona;
    }

    public Mexicano getPersona() {
        return Persona;
    }

    public void setPersona(Mexicano Persona) {
        this.Persona = Persona;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "Persona=" + Persona + ", next=" + next + '}';
    }

}
