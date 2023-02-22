package model;

import java.sql.*;
import java.util.Optional;

public class AccountImpl implements AccountDAO{
	private JDBC jdbc;
	
	public AccountImpl(JDBC jdbc) {
		this.jdbc = jdbc;
	}
	
	@Override
	public void createAccount(AccountEntity user) {
		// TODO Auto-generated method stub
		try(Connection conn = JDBC.getDB().getConnection()){
			
			PreparedStatement st = conn.prepareStatement("insert into account(username,userpass,realname,sex,email,phone) values(?,?,?,?,?,?)");
			st.setString(1, user.getUsername());
			st.setString(2, user.getUserpass());
			st.setNString(3, user.getReadlname());
			st.setString(4, user.getSex());
			st.setString(5, user.getEmail());
			st.setString(6, user.getPhone());
			st.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
    public Optional<AccountEntity> existAccount(String username) {
        try(var conn = JDBC.getDB().getConnection();
            var stmt = conn.prepareStatement(
                        "SELECT * FROM account WHERE username = ?")) {
            stmt.setString(1, username);
            var rs = stmt.executeQuery();
            if(rs.next()) {
                return Optional.of(new AccountEntity(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                ));
            } 
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

	
	
	
	
}
