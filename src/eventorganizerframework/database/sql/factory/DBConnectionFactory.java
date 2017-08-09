package eventorganizerframework.database.sql.factory;

import java.sql.Connection;

public interface DBConnectionFactory {
	public Connection createConnection();
}
