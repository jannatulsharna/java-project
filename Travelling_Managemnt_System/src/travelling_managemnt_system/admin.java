/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelling_managemnt_system;

/**
 *
 * @author Jannatul Ferdousi
 */
public  class admin {
    String name;
    String id;
    String email;
    int phnnmbr;
    String address;
    int age;
    String service_period;
    double amount;
    int seat_no;
    public admin(String name,String id,String email,int phnnmbr,String address,int age,String service_period, double amount, int seat_no){
         this.name = name;
        this.id = id;
        this.email = email;
        this.phnnmbr = phnnmbr;
        this.address = address;
        this.age = age;
        this.service_period = service_period;
        this.amount = amount;
        this.seat_no = seat_no;
    }
    void CheckPassport(){
        System.out.println("");
    } 
}
