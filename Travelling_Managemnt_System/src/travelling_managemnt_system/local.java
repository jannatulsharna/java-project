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
public class local extends customer implements offer {
    public local(String name,String email,String id,int phnnmbr,String address,int age,boolean couple_seat,boolean family_seat,boolean regulr_seat,int totalprice,boolean present,int price,double discount){
        super(name,email,id,phnnmbr,address,age,couple_seat,family_seat,regulr_seat,totalprice,present,price,discount);
    
    }
    void localcustomerdiscount(){
        discount = price - 1000;
    }
    public void offer(){
        if(totalprice>1000000){
            System.out.println("have a beautiful gift");
        }
        else{
            System.out.println("Thank you");
        }
    }
}
