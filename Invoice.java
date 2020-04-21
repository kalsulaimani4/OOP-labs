/*  Q) make a  class called invoice with four data members then make  a constuctor and then make the needed getter and setter methods and if the number of itemes is negative set the valuse to 0 and 
if the price is negtaive put 0.0 and at the last  methed gets the value of the invoice (the number of itemes * the price of eatch item */
package Lab2;

/**
 *
 * @author alsul
 */
public class Invoice {
    private String partNumber;
    private String partDiscription;
    private int numSold;
    private double pricePerItem;
    
    // constructor
     Invoice(){
         this.partNumber="none";
         this.partDiscription="none";
         this.numSold=0;
         this.pricePerItem=0.0;
        
    }
    // setter methods
    public void setPartNumber(String partNumber){
        this.partNumber =partNumber;
    }
    
    public void setPartDiscirbtion(String partDiscription){
        this.partDiscription= partDiscription;
    }
    
    public void setNumSold(int numSold){
        if(numSold < 0){
            this.numSold= 0;
        }else{
        this.numSold= numSold;
        }
    }
    
    
    public void setpricePerItem(double pricePerItem){
        if( pricePerItem < 0){
            this.pricePerItem= 0.0;
        }else{
       
        this.pricePerItem= pricePerItem;
        }
    }
     
     
    // getter methods
    public String getPartNumber(){
       return partNumber;
    } 
    
    public String getPartDiscription(){
      return partDiscription;
    }
    
    public int getNumSold(){
        return numSold;
    }
    
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    // get invlice value
    
    public double getInvoiceValue(){
       double total= getNumSold()*getPricePerItem();
       return total;
    }
}
