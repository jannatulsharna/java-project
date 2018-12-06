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
public class pertime extends employee{
    public pertime(String name,String email,String id,int phnnmbr,String address,int age,double salary,double service_period,double current_ba,boolean present){
    super(name,email,id,phnnmbr,address,age,salary,service_period,current_ba,present);
    }
    void per_day_salary(){
        salary = service_period*1000;
    }
    
}
