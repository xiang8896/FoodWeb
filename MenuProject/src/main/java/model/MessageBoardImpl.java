package model;

import java.util.*;
import java.sql.*;

public class MessageBoardImpl implements MessageBoardDAO {
	
	private JDBC jdbc;
	
	public MessageBoardImpl(JDBC jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<MessageBoardEntity> selectUsername(String username) {
		try(Connection conn = JDBC.getDB().getConnection();
			PreparedStatement st = conn.prepareStatement("select * from messageboard where username=?")){
			
			st.setString(1,username);
			
			ArrayList<MessageBoardEntity> messages = new ArrayList<>();
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				messages.add(new MessageBoardEntity(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3)
						));
			}
			return messages;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void speech(MessageBoardEntity message) {
		// TODO Auto-generated method stub
		try(Connection conn = JDBC.getDB().getConnection();
			PreparedStatement st = conn.prepareStatement("insert into messageboard(username,clock,speech) values(?,?,?)")){
			
			st.setString(1,message.getUsername());
			st.setString(2,message.getTime());
			st.setString(3, message.getSpeech());
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delSpeech(String username, String time) {
		// TODO Auto-generated method stub
		try(Connection conn = JDBC.getDB().getConnection();
			PreparedStatement st = conn.prepareStatement("delete from messageboard where username = ? and clock = ?")){
			
			st.setString(1,username);
			st.setString(2, time);
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<MessageBoardEntity> sequenceSpeech(int n) {
		// TODO Auto-generated method stub
		try(Connection conn = JDBC.getDB().getConnection();
			PreparedStatement st = conn.prepareStatement("select * from messageboard order by clock Desc limit ?")){
			
			ResultSet rs = st.executeQuery();
			
			ArrayList<MessageBoardEntity> messages = new ArrayList<>();
			while(rs.next()) {
				messages.add(new MessageBoardEntity(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3)));
			}
			return messages;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
