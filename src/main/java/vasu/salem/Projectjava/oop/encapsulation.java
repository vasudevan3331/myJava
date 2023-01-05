package vasu.salem.Projectjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class encapsulation {
    public static void main(String[] args) {
        Fella f=new Fella();
//        f.fellaName="Razak Mohamed S";
//        f.fellaPincode=636001;
//        f.fellaSalary=4.55;
        f.setFellaName("Razak Mohamed S");f.setFellaPincode(636001);f.setFellaSalary(4.5);
        System.out.println(f.getFellaName()+" "+f.getFellaPincode()+" "+f.getFellaSalary());

        Fella g=new Fella("Sabari nathan S",636001,3.1);
        //g.setFellaName("Sabari nathan S");g.setFellaSalary(3.1);g.setFellaPincode(636001);
        System.out.println(g.getFellaName()+" "+g.getFellaPincode()+" "+g.getFellaSalary());
        System.out.println(g);
    }
}

@Data

class Fella{
    private String fellaName;
    private int fellaPincode;
    private double fellaSalary;

    @Override
    public String toString() {
        return "Fella{" +
                "fellaName='" + fellaName + '\'' +
                ", fellaPincode=" + fellaPincode +
                ", fellaSalary=" + fellaSalary +
                '}';
    }

    public Fella(){
        System.out.println("Default constructor");
    }

    public Fella(String s,int i,double d){
        this.fellaName=s;
        this.fellaSalary=d;
        this.fellaPincode=i;
    }

   // setter
    public void setFellaName(String fellaName){
        this.fellaName=fellaName;
    }
    //getter
    public String getFellaName(){
        return fellaName;
    }

    public int getFellaPincode() {
        return fellaPincode;
    }

    public void setFellaPincode(int fellaPincode) {
        this.fellaPincode = fellaPincode;
    }

    public double getFellaSalary() {
        return fellaSalary;
    }

    public void setFellaSalary(double fellaSalary) {
        this.fellaSalary = fellaSalary;
    }

}
