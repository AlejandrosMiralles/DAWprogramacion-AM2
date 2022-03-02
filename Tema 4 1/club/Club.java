package club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private static ArrayList<Membership> members =  new ArrayList<Membership>();

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }


    public int joinedInMonth(int month){
        if (month<1 || month>12){
            System.out.println("Month " + month + " out of range. Must be in the range 1 ... 12");
            return 0;
        }

        int amountOfMonths = 0;

        for (Membership member : members) {
            if (member.getMonth() == (month)){
                amountOfMonths++;
            }
        }

        return amountOfMonths;
    }

    public static int purge(int month){
        int killedMembers = 0;
        Iterator<Membership> iteranator =  members.iterator();
        Membership member;
        
        while(iteranator.hasNext()){
            member = iteranator.next();

            if (member.getMonth() == month){
                members.remove(member);
                killedMembers++;
            }
        }

        return killedMembers;
    }
}