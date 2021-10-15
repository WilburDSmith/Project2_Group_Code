/*
 * @Author Wilbur Deano Smith (220003033)
 */
package za.ac.cput.stockshield;


public class Report 
{
    
    private int itemPrice;
    private String itemDescription;
    private int amountInStock;

    public Report(int itemPrice, String itemDescription, int amountInStock) 
    {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.amountInStock = amountInStock;
    }

    public int getItemPrice() 
    {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) 
    {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() 
    {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) 
    {
        this.itemDescription = itemDescription;
    }

    public int getAmountInStock()
    {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) 
    {
        this.amountInStock = amountInStock;
    }
    
}
