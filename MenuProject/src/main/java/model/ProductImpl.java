package model;

import java.util.*;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

import model.JDBC;
import model.Product;

public class ProductImpl {

	public List<Product> getAll(){
		List<Product> plist = new ArrayList();
		try(Connection conn = JDBC.getDB().getConnection()){
			PreparedStatement st = conn.prepareStatement("select * from productlist");
			ResultSet rs = st.executeQuery();
			FileOutputStream outSTr = null;
			BufferedOutputStream Buff=null;
			while(rs.next()) {
				Product p = new Product();
				
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				p.setPhoto(rs.getString("photo"));
				plist.add(p);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return plist;
	}
	
	public Product getId(int id) {
		Product p = null;
		try(Connection conn = JDBC.getDB().getConnection()){
			PreparedStatement st = conn.prepareStatement("select * from productlist where id=?");
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				p = new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getInt(3));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return p;
	}
}
