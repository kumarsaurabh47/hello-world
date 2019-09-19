package webdriverrr;

public class CallmethodSeventh {

	public static void main(String[] args) {
		
		SeventhMethod s = new SeventhMethod();
		s.launchApplication("https://facebook.com");
		/*s.closeApplication();*/
		s.elementPresent("email", false);

	}

}
