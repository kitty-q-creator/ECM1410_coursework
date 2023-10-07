package socialmedia;

import java.io.Serializable;

/**
 * Post class
 * Attributes:
 * static counter - used to count the IDs to ensure they are unique
 * ID - unique int for each Post (starts from 0)
 * message - must be no more than 100chars
 * authorID - ID of the account that the post is associated with
 * 
 * @author - 7720033503 720040807
 */

public class Post implements Serializable {
    protected static int counter = 0;
    protected int ID;// unique
    // IDs for normal posts start at 1 - 0 is emptyPost
    protected String message;// <=100chars
    protected int authorID;

    public Post(int authorID, String message) {// valid message - validated in createPost
        this.ID = counter;
        counter++;
        this.authorID = authorID;
        this.message = message;
    }

    // setters and getters *******************************

    /**
     * set counter (which the IDs count from), used only when loading
     * 
     * @param maxID - ID of the last created account. next ID will be maxID+1
     */
    public static void setIDOnLoad(int maxID) {
        counter = maxID + 1;
    }

    /**
     * getter for ID
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * getter for authorID
     * 
     * @return authorID
     */
    public int getAuthorID() {
        return authorID;
    }

    /**
     * getter for message
     * 
     * @return message
     */
    public String getMessage() {
        return message;
    }

}
