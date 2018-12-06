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
public class senior extends admin{
    public senior(String name,String id,String email,int phnnmbr,String address,int age,String service_period, double amount,int seat_no){
        super(name,email,id,phnnmbr,address,age,service_period,amount,seat_no);
    }
    void totalprice(ArrayList<customer>c)
    {
        for(customer a:c){
            if(a.regulr_seat == true){
                System.out.println("totalprice :"+(400*seat_no));
            }
        }
        } 
    
        @Override
        void CheckPassport(){
        System.out.println("check foreign passport");
        }  
}
