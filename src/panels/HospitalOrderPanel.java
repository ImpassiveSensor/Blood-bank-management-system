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
public class HospitalOrderPanel {
    private int Hospital_ID, Order_quantity, Order_number;
    private String Order_group;

    public HospitalOrderPanel(int Hospital_ID, int Order_number, String Order_group, int Order_quantity) {
        this.Hospital_ID = Hospital_ID;
        this.Order_number = Order_number;
        this.Order_group = Order_group;
        this.Order_quantity = Order_quantity;
    }
    public int getHospital_ID() {
        return Hospital_ID;
    }

    public void setHospital_ID(int Hospital_ID) {
        this.Hospital_ID = Hospital_ID;
    }

    public int getOrder_quantity() {
        return Order_quantity;
    }

    public void setOrder_quantity(int Order_quantity) {
        this.Order_quantity = Order_quantity;
    }

    public int getOrder_number() {
        return Order_number;
    }

    public void setOrder_number(int Order_number) {
        this.Order_number = Order_number;
    }

    public String getOrder_group() {
        return Order_group;
    }

    public void setOrder_group(String Order_group) {
        this.Order_group = Order_group;
    }
    
    
    
}
