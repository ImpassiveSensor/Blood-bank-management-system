/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

/**
 *
 * @author Asus
 */
public class HomeInformation {
    private String Donor_Name, group;

    public HomeInformation(String Donor_Name) {
        this.Donor_Name = Donor_Name;
    }

    public String getDonor_Name() {
        return Donor_Name;
    }

    public void setDonor_Name(String Donor_Name) {
        this.Donor_Name = Donor_Name;
    }
    public void setgroup(String Donor_grp) {
        this.group = Donor_grp;
    }
     public String getgroup() {
        return group;
    }
}
