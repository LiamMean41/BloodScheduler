/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author mossotron
 */
public interface PersonInterface {
    public void enqueue(person p);
    public person dequeue();
    public person peekQueue();
    public String displayQueue();
    public void push(person p);
    public person pop();
    public person peekStack();
    public String displayStack();
    public void insertPriority(person p);
    public person removePriority();
    public person peekPriority();
    public String displayPriority();
    
}
