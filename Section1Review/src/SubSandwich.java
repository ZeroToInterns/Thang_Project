public class SubSandwich
{
    public static final int CHICKEN = 0;
    public static final int PASTRAMI = 1;
    public static final double COST_FOR_EXTRA_MEAT = 1.50;
    private int type;
    private int size;
    private boolean meat;
    
    //Constructor of the sandwich
    public SubSandwich(int theType, int theSize, boolean extraMeat) {
        type = theType;
        size = theSize;
        meat = extraMeat;
        if (type == CHICKEN) {
            type = CHICKEN;
        }
        else {
            type = PASTRAMI;
        }
        
        if (size == 6) {
            size = 6;
        }
        else {
            size = 12;
        }
    }

    //return the size of the sandwich
    public int getSize() {
        return size;
    }

    //set a new size of the sandwich
    public void setSize (int newSize) {
        this.size = newSize;
        if (newSize == 6) {
            size = 6; 
        }
        else {
            size = 12;
        }
    }

    //return the extraMeat boolean true || false
    public boolean isExtraMeat() {
        return meat;
    }

   //Get the type of sandwiches in a string
    public String getType() {
        if (type == CHICKEN) {
            return "chicken";
        }
        else {
            return "pastrami";
        }
    }

    //Get the cost of the sandwich
    public double getCost()
    {
        double cost = 0;
        //check for the size coresponding to the cost
        if (size == 6) {
            if (type == CHICKEN) {
                cost += 5.50;
            }
            else  {
                cost += 6.95;
            }
        }
        else {
            if (type == CHICKEN) {
                cost += 8.95;
            }
            else  {
                cost += 9.50;
            }
        }
        //if user want extra meat, add the extra price to the original price
        if (meat == true) {
            cost += COST_FOR_EXTRA_MEAT;
        }
        return cost;
    }
}
