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
public class junior extends admin {
    public junior(String name,String id,String email,int phnnmbr,String address,int age,String service_period, double amount,int seat_no){
        super(name,email,id,phnnmbr,address,age,service_period,amount,seat_no);
    }
    void employeepresent(ArrayList<employee>e){
        for(employee b:e){
            if(b.service_period>1.00 && b.present == true)
            {
                System.out.println("present");
            }
            else{
                   System.out.println(" not present"); 
                    }
        }
    }

        @Override
        void CheckPassport(){
        System.out.println("check local passport");
     
    
        }
}
