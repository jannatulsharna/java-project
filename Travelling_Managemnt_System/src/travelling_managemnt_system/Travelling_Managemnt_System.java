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
public class Travelling_Managemnt_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       customer c1 = new customer("jannat","tyf","ja@gamil",987,"sjud",34,true,false,false,4000,true,5000,5000.00);
       ArrayList<customer>p1 = new ArrayList<>();
        c1.calcuprice(p1);
    
    employee y1 = new employee("jangnata","tjhyf","jahfgvj@gamil",987,"sjud",34,5000.00,34.00,45.00,true);
    y1.salary();
    y1.salary_widthdraw(500.00);
    y1.check_work_hour();
    
    admin m1 = new admin("jannatjyhg","thgfyf","jajghki@gamil",987,"sjud",34,"30",50000.00,5);
   
    m1.CheckPassport();
    junior j1 = new junior("jannatjyhg","thgfyf","jajghki@gamil",987,"sjud",34,"30",50000.00,5);
    ArrayList<employee>d1 = new ArrayList<>();
    j1.employeepresent(d1);
    senior s1 = new senior("jannatjyhg","thgfyf","jajghki@gamil",987,"sjud",34,"30",50000.00,5);
    s1.totalprice(p1);
    }
}