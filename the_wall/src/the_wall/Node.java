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
    Node next;

    public Node(Mexicano Persona, Node next) {
        this.Persona = Persona;
        this.next = next;
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
