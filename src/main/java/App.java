import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.model.Card;
import com.shop.model.User;
import com.shop.service.ProductService;
import com.shop.service.ProductServiceInterface;
import com.shop.service.UserService;
import com.shop.service.UserServiceInterface;

public class App {

	public static void main(String[] args) throws SQLException,NullPointerException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		UserServiceInterface service = context.getBean("userService", UserService.class);
		
		String sql = "insert into users (email,username,password,name,lastname,address,money,number_of_card) values (?,?,?,?,?,?,?,?)";
		
	
	}

}
