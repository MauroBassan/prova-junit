package it.corso.java.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.cj.xdevapi.PreparableStatement;

public class EsempioDatabase {
	
	private Connection conn;

	public static void main(String[] args) {
		EsempioDatabase db = new EsempioDatabase();
		try {
			System.out.println(db.getConnection().isClosed());
			
			//db.esSelect();
			db.esInsert("lorela", "jace", "zzz@yyy", "8888888");
			//db.esUpdate();
			db.esDelete();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	
	private void esDelete() throws SQLException {
		String delete = "DELETE FROM clienti WHERE id = 7";
		
		PreparedStatement ps = getConnection().prepareStatement(delete, Statement.RETURN_GENERATED_KEYS);
		ps.executeUpdate();	
	}
	
	
	private void esUpdate() throws SQLException {
		String update = "UPDATE clienti SET telefono = '6666666' WHERE id = 1";
		
		PreparedStatement ps = getConnection().prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
		
		ps.executeUpdate();	
	}
	
	
	private void esSelect() throws SQLException {
		String query = "SELECT  id, nome, cognome, email, telefono FROM clienti";
		
		/* per eseguire la query dobbiamo creare un oggetto
		 * di tipo Prepared statement che serve a passare in input  a Mysql la query x poter effetturare
		 */
		
		PreparedStatement ps = getConnection().prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		  
		while(rs.next()) {
			System.out.println("id = " + rs.getInt(1));
			System.out.println("nome = " + rs.getString(2));
			System.out.println("cognome = " + rs.getString(3));
			System.out.println("email = " + rs.getString(4));
			System.out.println("telefono = " + rs.getString(5));
			System.out.println("------------------------------");
		}	
	}
	
	
	private void esInsert(String nome, String cognome, String email, String telefono) throws SQLException {
		/* metodo normale
		String insert = "INSERT INTO clienti(nome, cognome, email, telefono) VALUES ('" +nome+"', '"+cognome+"', '"+email+"', '"+telefono+"')" ;
		*/
		// SE VOGLIO TUTELARMI DA UNA SQL INJECTION MAPPO I VALORI COME SEGUE: VEDI PS.SET()
		String insert = "INSERT INTO clienti(nome, cognome, email, telefono) VALUES (?, ?, ?, ?)" ;
		
		PreparedStatement ps = getConnection().prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
		// mappo i valori passati in input dal metodo, ogni value è un ?
		ps.setString(1, nome);
		ps.setString(2, cognome);
		ps.setString(3, email);
		ps.setString(4, telefono);
		
		
		/* eseguo la query e il resultSet  mi serve al passo successivo x verificare i dati scritti*/
		ps.executeUpdate();
		
		//ora prendo i dati inseriti precedentemente e li metto in un Result Set
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		System.out.println("id è: " + rs.getInt(1));
	}
	
	
	// creo metodo x connettermi al db
	private Connection getConnection() throws SQLException {
		//  controllo che l'stanza non sia null, altrimenti la facciamo noi
		if(conn == null) {
			// se l'istanza è null, creo l'istanza come segue:
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setServerName("localhost");
			dataSource.setPortNumber(3306);
			dataSource.setUser("root");
			dataSource.setPassword("BMWfj055yx");
			dataSource.setDatabaseName("corso_java");
			dataSource.setServerTimezone("UTC");
		
			// a questo punto avendo impostato i paramentri x connetterci, ci connettiamo:
			conn = dataSource.getConnection();
			
		}
		return conn;
	}
}
