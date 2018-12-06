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
public class employee {
    String name;
    String id;
    String email;
    int phnnmbr;
    String address;
    int age;
    double salary;
    double service_period;
    double current_bal;
    boolean present;
    public employee(String name,String email,String id,int phnnmbr,String address,int age,double salary,double service_period,double current_bal, boolean present){
        this.name = name;
        this.id = id;
        this.email = email;
        this.phnnmbr = phnnmbr;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.service_period = service_period;
        this.current_bal = current_bal;
        this.present = present;
    }
    public void salary(){
        current_bal = current_bal + salary;
    }
    public void salary_widthdraw(double widthdraw){
        current_bal = current_bal - widthdraw;
    }
    public void check_work_hour(){
        if(service_period<8)
        {
          current_bal = salary - (salary * .1);  
        }
        else 
        {
          current_bal = current_bal;  
        }
    }
}
