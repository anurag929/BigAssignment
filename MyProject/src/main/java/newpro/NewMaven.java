package newpro;

import java.util.ResourceBundle;

public class NewMaven {
	
	public int userLogin(String in_user, String in_password)
	{
		ResourceBundle rb = ResourceBundle.getBundle("Config");
		String userName= rb.getString("username");
		String password= rb.getString("password");
		
		if (in_user.equals(userName)&& in_password.equals(password))
			return 1;
		else
			return 0; 

	
	}

}
