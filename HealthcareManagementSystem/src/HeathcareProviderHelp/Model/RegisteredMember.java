/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeathcareProviderHelp.Model;
/**
 *
 * @author Rishi
 */
public class RegisteredMember {
    
    
   private String HelperGroupId;
   private String QualifiedMemberName;
    
    
    public String getHelperGroupId() {
        return HelperGroupId;
    }

    public void setHelperGroupId(String HelperGroupId) {
        this.HelperGroupId = HelperGroupId;
    }

    public String getQualifiedMemberName() {
        return QualifiedMemberName;
    }

    public void setQualifiedMemberName(String QualifiedMemberName) {
        this.QualifiedMemberName = QualifiedMemberName;
    }
    
    
    @Override
    public String toString(){
        return HelperGroupId;
    }

    
}
