package Services;

import java.sql.Connection;

import org.junit.Test;

public class ServicesTest {

	@Test
	public void testDbService() {
		MySqlDbService dbService = new MySqlDbService();

		Connection connectio = dbService.initConn();
		
		System.out.println("222");
	}

}
