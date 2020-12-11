// Thato Omphile Nameng
// 17748365 DISD 1 G 1
// Questio 3 classes

import javax.swing.*;
public class first {
    
    
    private String town = "";
    private String weight;
    private String courier;
    private double prices;
    private double vat = 70;
    

  
    public String getTown() {
        return town;
    }

    public String getWeight() {
        return weight;
    }

    public String getCourier() {
        return courier;
    }

    public void setTown() {
        
        //input here
        String Selecttowns = JOptionPane.showInputDialog("select the town which the"
                + " parcel will  be delivered: \n1) Cape Town\n"
                + "2) Pretoria \n 3) Durban");
        
        int input = Integer.parseInt(Selecttowns);
        
        switch( input){
            
            case 1:
                
                System.out.println("Town:       Cape Town");
                town = "Cape Town";
                break;
            
            case 2:
                System.out.println("Town:       Pretoria");
                town = "Pretoria";
                break;
                                
            case 3:
                     
                System.out.println("Town:       Durban ");
                town = "Durban";
                break;
        }   
    }
    public void setWeight() 
    {
        String weights = JOptionPane.showInputDialog("select the weight category"
                + "of the parcel which will be delivered to " + town+
                "\n 1) 0kg - 4kg \n 2) 5kg - 9kg \n 3)  over 10kg");
        
        int input = Integer.parseInt(weights);
        
        switch( input)
        {            
            case 1:
                System.out.println("Weight:       0kg - 4kg");
                
                 prices = 300;             
                break;
            
            case 2:
                System.out.println("Weight:       5kg - 9kg");
                
                prices = 500;
                break;
                                
            case 3:
                System.out.println("Weight:       over 10kg ");
                
                prices = 700;
                break;
        }
       }
    public void setCourier() 
    { 
         String towns = JOptionPane.showInputDialog("select the courier company"
                 + " to deliver parcel weight of 5kg to " + town+ "\n 1) ABC"
                         + " Courier \n2) Fast Track \n 3) Rest Assured");
        
        int input = Integer.parseInt(towns);
        switch( input){
            
            case 1:
                System.out.println("ABC Courier");
                break;
            
            case 2:
                System.out.println("Fast Track");
                break;
                
                
                 case 3:
                System.out.println("Rest Assured");
                break;
        }     
    }
    
    public void price(){
        System.out.println("Price:      "+ prices);
    }
    public void vat(){
        
        System.out.println("Vat:      " +  vat);
    }
    
    public void tatolDue(){
        System.out.println("Total:    "+   (prices + vat));
    }
    
    
    
    
}
