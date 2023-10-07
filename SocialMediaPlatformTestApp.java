import java.io.IOException;

import socialmedia.AccountIDNotRecognisedException;
import socialmedia.BadSocialMedia;
import socialmedia.HandleNotRecognisedException;
import socialmedia.IllegalHandleException;
import socialmedia.InvalidHandleException;
import socialmedia.InvalidPostException;
import socialmedia.NotActionablePostException;
import socialmedia.PostIDNotRecognisedException;
import socialmedia.SocialMedia;
import socialmedia.SocialMediaPlatform;

/**
 * A short program to illustrate an app testing some minimal functionality of a
 * concrete implementation of the SocialMediaPlatform interface -- note you will
 * want to increase these checks, and run it on your SocialMedia class (not the
 * BadSocialMedia class).
 *
 * 
 * @author Diogo Pacheco
 * @version 1.0
 */
public class SocialMediaPlatformTestApp {

	/**
	 * Test method.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		System.out.println("The system compiled and started the execution...");

		SocialMediaPlatform platform = new SocialMedia();

		assert (platform.getNumberOfAccounts() == 0) : "Innitial SocialMediaPlatform not empty as required.";
		assert (platform.getTotalOriginalPosts() == 0) : "Innitial SocialMediaPlatform not empty as required.";
		assert (platform.getTotalCommentPosts() == 0) : "Innitial SocialMediaPlatform not empty as required.";
		assert (platform.getTotalEndorsmentPosts() == 0) : "Innitial SocialMediaPlatform not empty as required.";

		Integer id;
		try {
			// id = platform.createAccount("my_handle");
			// platform.createAccount("my_second_handle", "This is our amazing test
			// account");

			// platform.updateAccountDescription("my_handle", "lets add a discriptipn");
			// platform.updateAccountDescription("my_second_handle",
			// "this is a brand new, very inventive discription. \nI love this.");

			// assert (platform.getNumberOfAccounts() == 2) : "number of accounts registered
			// in the system does not match";
			// platform.createPost("my_handle", "HI!");
			// platform.createPost("my_handle", "HI :)");
			// platform.createPost("my_second_handle", "Hello");

			// platform.endorsePost("my_handle", 1);
			// platform.endorsePost("my_handle", 3);
			// platform.commentPost("my_handle", 1, "First test message wats up");
			// platform.commentPost("my_handle", 3, "Second test message");
			// platform.commentPost("my_handle", 1, "reply2 to 1");
			// platform.commentPost("my_second_handle", 6, "reply to 6");
			// // platform.commentPost("my_handle", 4,"bob");
			// platform.commentPost("my_handle", 7, "Yay this is number 3");
			// System.out.println(platform.showAccount("my_handle"));
			// // System.out.println(platform.showAccount("my_second_handle"));
			// for (int i = 1; i < 9; i++) {
			// System.out.println(platform.showIndividualPost(i));
			// }
			// System.out.println(platform.getMostEndorsedPost());
			// System.out.println(platform.getNumberOfAccounts() + " " +
			// platform.getTotalCommentPosts() + " "
			// + platform.getTotalEndorsmentPosts() + " " +
			// platform.getTotalOriginalPosts());
			// System.out.println(platform.showPostChildrenDetails(1));

			// platform.savePlatform("file.ser");
			// System.out.println("saved");

			platform.loadPlatform("file.ser");
			System.out.println("loaded");
			// platform.showAccount(("my_handle"));

			platform.commentPost("my_second_handle", 1, "reply3 to 1");
			platform.commentPost("my_second_handle", 1, "reply4 to 1");

			System.out.println(platform.showPostChildrenDetails(1));

			// platform.removeAccount(id);
			// System.out.println(platform.getMostEndorsedAccount());
			// System.out.println(platform.getNumberOfAccounts() == 1);
			// platform.removeAccount("my_second_handle");
			// System.out.println(platform.getNumberOfAccounts() == 1);

			// System.out.println(platform.getNumberOfAccounts() == 0);
			// assert (platform.getNumberOfAccounts() == 0) : "number of accounts registered
			// in the system does not match";

		}
		// catch (IllegalHandleException e) {
		// assert (false) : "IllegalHandleException thrown incorrectly";
		// } catch (InvalidHandleException e) {
		// assert (false) : "InvalidHandleException thrown incorrectly";
		// }
		// catch (AccountIDNotRecognisedException e) {
		// assert (false) : "AccountIDNotRecognizedException thrown incorrectly";
		// // }
		catch (HandleNotRecognisedException e) {
			assert (false) : "HandleNotRecognisedException thrown incorrectly";
		} catch (InvalidPostException e) {
			assert (false) : "InvalidPostException thrown incorrectly";
		} catch (NotActionablePostException e) {
			assert (false) : "NotActionablePostException thrown incorrectly";
		} catch (PostIDNotRecognisedException e) {
			assert (false) : "PostIDNotRecognisedException thrown incorrectly";
		} catch (IOException e) {
			assert (false) : "IOException thrown incorrectly";
			System.out.println(e.getMessage() + "IO");
		} catch (ClassNotFoundException e) {
			assert (false) : "ClassNotFoundException thrown incorrectly";
			System.out.println(e.getMessage() + "class");
		}

	}

}
