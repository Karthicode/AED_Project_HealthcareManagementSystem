/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkerProvider;

import java.util.ArrayList;

/**
 *
 * @author harshithnarahari
 * 
 */
public class Workers {

    private ArrayList<Worker> workerList;

    public Workers() {
        workerList = new ArrayList();
    }
<<<<<<< HEAD

=======
>>>>>>> 1caebc23f829bb89351302a2585372dc25dce619
    public ArrayList<Worker> getEmployeeList() {
        return workerList;
    }
    
    public void addEmployee(Worker worker){
        workerList.add(worker);
    }
    
<<<<<<< HEAD
    
=======
 
>>>>>>> 1caebc23f829bb89351302a2585372dc25dce619
}
