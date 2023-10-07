package socialmedia;

import java.io.Serializable;

/**
 * Account class
 * Attributes:
 * static counter - used to count the IDs to ensure they are unique
 * ID - unique int for each Account (starts from 0)
 * handle - unique account handle
 * desc - account description
 * 
 * @author - 7720033503 720040807
 */

public class Account implements Serializable {
    protected static int counter = 0;
    private int ID;// unique
    // ID starts from 0 for Account class
    private String handle;// unique also
    private String description;

    /**
     * Account creation method
     * 
     * @param handle - the unique handle of the account
     * @param desc   - the description of the account, may be an empty string
     */
    public Account(String handle, String desc) {
        this.ID = counter;
        counter++;
        this.handle = handle;
        this.description = desc;
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
     * getter for handle
     * 
     * @return handle
     */
    public String getHandle() {
        return handle;
    }

    /**
     * setter for handle
     * 
     * @param newHandle - must be a valid handle
     */
    public void setHandle(String newHandle) {// not validated here
        handle = newHandle;
    }

    /**
     * getter for description
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * setter for description
     * 
     * @param newDescription
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }
}
