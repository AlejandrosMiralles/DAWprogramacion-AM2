package NaiveTicketMachine;

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
class TicketMachine{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost){
        price = cost;
        balance = 0;
        total = 0;
    }
    /** A void constructor. Later the user has to set the price with setPrice(cost) */
    public TicketMachine(){
        price = 0;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice(){ return price;}

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance(){ return balance;}

    /**
     * Returns the Total of......something. Idk
     * @return
     */
    public int getTotal(){ return total;}

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount){
        balance = balance + amount;
    }

    /**
     * @param cost Modifies the value of Price for the parameter cost
     */
    public void setPrice(int cost){ price = cost;}

    /**
     * Message used when someone introduces an incorrect amount of money
     */
    static void prompt(){ System.out.println("Please, insert the correct amount of money");}

    /**
     * Message used when the machine has to show the user the ticket's price
     */
    void showPrice(){ System.out.println("The price of the ticket is "+price+" cents.");}
    
    void empty(){ total = 0;}

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket(){
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }

    public String toString(){ return "Price = "+getPrice()+"\nBalance = "+getBalance()+"\nTotal = "+getTotal(); }

    public static void main(String[] args) {
        TicketMachine2 redJLine = new TicketMachine2(77);
    
        redJLine.printTicket();

        System.out.println("\n\n\nSegundo intento:\n");

        redJLine.insertMoney(113);

        redJLine.printTicket();

        System.out.println("\n\nSegundo ticket: ");

        redJLine.setDiscount(99);

        redJLine.printTicket();
    
    } 
}