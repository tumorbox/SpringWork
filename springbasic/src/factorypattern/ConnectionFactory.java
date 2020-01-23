package factorypattern;
public class ConnectionFactory {
	public Connection getConnection(String str) {
		String url = str.toLowerCase();				//전부 소문자로 변경
		if (url.indexOf("oracle") >= 0) {
			return new OracleConnection(url);
		} else if (url.indexOf("mysql") >= 0) {
			return new MySQLConnection(url);
		} else if (url.indexOf("mongo") >= 0) {
			return new MongoConnection(url);
		} else {
			return null;
		}
	} 	
}
