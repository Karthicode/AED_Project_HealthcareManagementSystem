/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySupply.FirstAidSupply;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rishi
 */

public class FirstAidKitDirectory {
    
    ArrayList<FirstAidKit> firstAidKits = new ArrayList<>();

    public ArrayList<FirstAidKit> getFirstAidKits() {
        return firstAidKits;
    }

    public void setFirstAidKits(ArrayList<FirstAidKit> firstAidKits) {
        this.firstAidKits = firstAidKits;
    }
    
    public void addFirstAidKits(FirstAidKit firstAid){
        firstAidKits.add(firstAid);
    }
    
    public FirstAidKit findMedSupEquipByName(String first_Aid_Kit_Name){
        for(FirstAidKit medSupEquip: firstAidKits){
            if(medSupEquip.getFirst_Aid_Name().equals(first_Aid_Kit_Name))
                return medSupEquip;
        }
        return null;
    }

   
    
    
}
