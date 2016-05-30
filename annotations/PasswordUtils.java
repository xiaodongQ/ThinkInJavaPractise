package annotations;
import java.util.*;

public class PasswordUtils {
	// 注解的元素在使用时表现为名-值对的形式，并需置于@UseCase声明之后的括号中
	@UseCase(id = 47, description = 
			"Passwords must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49, description = 
			"New passwords can't equal previously used ones")
	public boolean checkForNewPassword(
			List<String> prePasswords, String password) {
		return !prePasswords.contains(password);
	}
}
