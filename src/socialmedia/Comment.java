package socialmedia;

/**
 * Comment inherits from Post
 * Has additional attribute:
 * referenceID - the ID of the post that the comment is referencing
 */
public class Comment extends Post {
    protected int referenceID;// post that the comment is referencing

    /**
     * Constructor for Comment
     * 
     * @param accountID   - the account making the comment
     * @param message     - the message that the comment will carry
     * @param referenceID - the ID of the post that the comment is referencing
     */
    public Comment(int accountID, String message, int referenceID) {
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

    /**
     * set the referenceID to 0
     * this points it to an empty post
     * to be called in deletePost
     */
    public void zeroReferenceID() {
        referenceID = 0;
    }
}
