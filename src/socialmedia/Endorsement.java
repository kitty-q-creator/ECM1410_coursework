package socialmedia;

/**
 * Endorsement inherits from Post
 * Has additional attribute:
 * referenceID - the ID of the post that the endorsement is referencing
 */
public class Endorsement extends Post {
    protected int referenceID;// post that the endorsement is referencing

    /**
     * Constructor for Endorsement
     * 
     * @param accountID   - the account making the endorsement
     * @param message     - the message that the endorsement will carry
     * @param referenceID - the ID of the post that the endorsement is referencing
     */
    public Endorsement(int accountID, String message, int referenceID) {
        super(accountID, message);
        this.referenceID = referenceID;
    }

    /**
     * getter for referenceID
     * 
     * @return referenceID
     */
    public int getReferenceID() {
        return referenceID;
    }
}
