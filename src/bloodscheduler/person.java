/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author mossotron
 */
public class person {
    
    private String name;
    private int age;

    person() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private enum priority{ URGENT, MEDIUM, LOW};
    private String gpdetails;
    private boolean arrived;
    private boolean fromWard;

    public person(String name, int age, String gpdetails, boolean arrived, boolean fromWard) {
        this.name = name;
        this.age = age;
        this.gpdetails = gpdetails;
        this.arrived = arrived;
        this.fromWard = fromWard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpdetails() {
        return gpdetails;
    }

    public void setGpdetails(String gpdetails) {
        this.gpdetails = gpdetails;
    }

    public boolean isArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public boolean isFromWard() {
        return fromWard;
    }

    public void setFromWard(boolean fromWard) {
        this.fromWard = fromWard;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", age=" + age + ", gpdetails=" + gpdetails + ", arrived=" + arrived + ", fromWard=" + fromWard + '}';
    }


}
