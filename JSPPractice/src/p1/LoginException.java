package p1;

public class LoginException extends Exception{

	@Override
	public String toString() {
		return "Login Failed..!! Username or password does not exists";
	}
}
