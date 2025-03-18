/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

import java.util.ArrayList;

/**
 *
 * @author mossotron
 */
public class AddPerson implements PersonInterface{
     ArrayList<String> personData;

    public AddPerson(ArrayList<String> theStack) {
        this.personData = theStack;
    }

     
    public boolean isEmpty(){
        return personData.isEmpty();
        
    }

    public void push(Object newItem){
        personData.add(0, (String)newItem); 
    }
    
    public Object remove(){
        if (!(personData.isEmpty())){
            return personData.remove(0);
        }else{
            return null;
        }
    }
    
    public Object add() {
      if (personData.isEmpty()) {
          System.out.println("Empty stack");
          return null;
      } else {    
          return personData.get(0);
      }
    }
  
    public int size(){
        return personData.size();
    }

    public String displayStack(){
       String str = new String(); 
       if(personData.isEmpty()){
           str = str.concat("EMPTY!");
       }else{
           for (int i = 0; i<personData.size(); i++){
               str = str.concat(personData.get(i));
               str = str.concat(" ; ");
           }
       }
       return str;
    }
    
    public Object get() {
       String obj;
       obj = personData.get(0);
       System.out.println(obj);

       return obj;
    }

    public String getIndex(int firstInList) {
        int sol = firstInList; 
        
        String first = personData.get(sol);
        
        System.out.println(first);
        return first;
    }

    @Override
    public String diplayStack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
