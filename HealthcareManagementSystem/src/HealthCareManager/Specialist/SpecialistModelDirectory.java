
package HealthCareManager.Specialist;


import java.util.HashMap;

/**
 *
 * @author Rishi
 */
public class SpecialistModelDirectory {
    
    private HashMap<String, Specialist> specialist_List = new HashMap<>();

    public HashMap<String, Specialist> getSpecialist_List() {
        return specialist_List;
    }

    public void setSpecialist_List(HashMap<String, Specialist> specialist_List) {
        this.specialist_List = specialist_List;
    }
    public SpecialistModelDirectory() {
    }

    public void addSpecialist(String user_id, Specialist specialist) {
        specialist_List.put(user_id, specialist);
    }
    
}
