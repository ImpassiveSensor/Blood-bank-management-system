package panels;



/**
 *
 * @author Asus
 */
public class UserBloodPanels {
    private int Donor_ID, Bag_Number;
    private String Donor_Name, Grp, dateOfDonation;

    public UserBloodPanels(int Donor_ID, String Grp, String dateOfDonation, int Bag_Number) {
        this.Donor_ID = Donor_ID;
        this.Bag_Number = Bag_Number;
        //this.Donor_Name = Donor_Name;
        this.Grp = Grp;
        this.dateOfDonation = dateOfDonation;
    }

    public int getDonor_ID() {
        return Donor_ID;
    }

    public void setDonor_ID(int Donor_ID) {
        this.Donor_ID = Donor_ID;
    }

    public int getBag_Number() {
        return Bag_Number;
    }

    public void setBag_Number(int Bag_Number) {
        this.Bag_Number = Bag_Number;
    }

    public String getGrp() {
        return Grp;
    }

    public void setGrp(String Grp) {
        this.Grp = Grp;
    }

    public String getDateOfDonation() {
        return dateOfDonation;
    }

    public void setdateOfDonation(String dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }

    
}