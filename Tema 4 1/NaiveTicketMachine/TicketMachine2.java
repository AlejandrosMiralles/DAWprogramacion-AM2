package NaiveTicketMachine;

/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine2{
    // The price of a ticket from this machine.
    private float price;
    // The amount of money entered by a customer so far.
    private float balance;
    // The total amount of money collected by this machine.
    private float total;
    // The discount that will be aplicated
    private float discount;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine2(int cost){
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public float getPrice(){
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public float getBalance(){
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount){
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    public void setDiscount(int discount){ this.discount = discount;}

    /**  */
    float emptyMachine(){
        float total = this.total;

        this.total = 0;

        return total;
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket(){
        float amountToPay = price * (1 - discount/100) - balance;

        if(amountToPay<=0) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance(){
        int amountToRefund;
        amountToRefund = (int) balance;
        balance = 0;
        return amountToRefund;
    }
}