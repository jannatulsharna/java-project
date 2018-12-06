/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelling_managemnt_system;

import java.util.ArrayList;

/**
 *
 * @author Jannatul Ferdousi
 */
public class customer {
    String name;
    String id;
    String email;
    private int phnnmbr;
    String address;
    int age;
    boolean couple_seat;
    boolean family_seat;
    boolean regulr_seat;
    int totalprice;
    boolean present;
    int price;
    double discount;
    public customer(String name,String email,String id,int phnnmbr,String address,int age,boolean couple_seat,boolean family_seat,boolean regulr_seat,int totalprice,boolean present,int price,double discount){
        this.name = name;
        this.id = id;
        this.email = email;
        this.phnnmbr = phnnmbr;
        this.address = address;
        this.age = age;
        this.couple_seat = couple_seat;
        this.family_seat = family_seat;
        this.regulr_seat = regulr_seat;
        this.totalprice = totalprice;
        this.present = present;
        this.price = price;
        this.discount = discount;
    }
    public int getphnnmbr(){
        return phnnmbr;
    }
    public void setphnnmbr(int phnnmbr){
        this.phnnmbr = phnnmbr;
    }
    void calcuprice(ArrayList<customer>k){
      for(customer c :k){
          if(c.couple_seat == true){
              System.out.println(name+" "+id+" "+email+" "+phnnmbr+" "+address+" "+age+" "+"totalprice :"+price*55000+-(discount));
          }
          else if(c.family_seat == true){
              System.out.println(name+" "+id+" "+email+" "+phnnmbr+" "+address+" "+age+" "+"totalprice :"+price*50000+-(discount));
          }
          else if(c.regulr_seat == true){
              System.out.println(name+" "+id+" "+email+" "+phnnmbr+" "+address+" "+age+" "+"totalprice :"+price*20000+-(discount));
          }
          else {
            System.out.println("totalprice :default");  
          }
      }
    }
}
