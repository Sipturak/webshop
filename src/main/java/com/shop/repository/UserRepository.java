package com.shop.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shop.helper.DbEnum;
import com.shop.helper.HelperConnectionDb;
import com.shop.model.Card;
import com.shop.model.User;

public class UserRepository extends Provider implements UseerRepositoryInterface{
	
	
	public UserRepository() throws SQLException {
		super(HelperConnectionDb.getDatabase.connect(DbEnum.Mysql));
	}
	
	/* (non-Javadoc)
	 * @see com.shop.repository.UseerRepositoryInterface#hasUser(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean hasUser(String sql,String usernameoremail, String password) throws SQLException {
		
		ResultSet rs = super.getUserResult(sql, usernameoremail, password);
		if(rs.next()) {
			return true;
		}	
		return false;
	}
	
	/* (non-Javadoc)
	 * @see com.shop.repository.UseerRepositoryInterface#registerUser(java.lang.String, com.shop.model.User)
	 */
	@Override
	public void registerUser (String sql, User user) throws SQLException,NullPointerException {
		PreparedStatement pr = super.getPreparedStatement(sql);
		//get all user fileds
		//see if card exsist
		//and register user or throw exception
		//and execute query
		String sql1 = "select * from cards where id = ?";
		user.setCard(getCard(sql1,(user.getCard().getNumberOfCard())));
		pr.setString(1, user.getEmail());
		pr.setString(2, user.getPassword());
		pr.setString(3, user.getName());
		pr.setString(4, user.getLastname());
		pr.setString(5, user.getAddress());
		pr.setString(6, user.getCard().getNumberOfCard());
		pr.execute();
	}
	
	@Override
	public void updateUser(String sql, double money,String id) throws SQLException {
		PreparedStatement pr = super.getPreparedStatement(sql);
		pr.setDouble(1, money);
		pr.setString(2, id);
		pr.executeUpdate();
	}
	
	@Override
	public boolean isLogin(String sql, String email) throws SQLException {
		
		ResultSet rs = super.getResultOneArg(sql, email);
		
		if(rs.next())
			return true;
		rs.close();
		return false;
	}
	
	@Override
	public double getMoney(String sql, String email) throws SQLException {
		
		ResultSet rs = super.getResultOneArg(sql, email);
		
		if(rs.next()) {
			return rs.getDouble("money");
		}
		rs.close();
		return 0;
	}
	
	@Override
	public User getUser(String sql,String email) throws NullPointerException, SQLException {
		User user = null;
		
		ResultSet rs = super.getResultOneArg(sql, email);
		String sql1 = "select * from cards where id = ?";
		Card card = null;
		if(rs.next()) {
			card = getCard(sql1, rs.getString("number_of_card"));
		}
		rs.close();
		user = new User(card);
		
		return user;
	}
	
	private Card getCard(String sql,String arg0) throws SQLException,NullPointerException {
		
		ResultSet rs = super.getResultOneArg(sql, arg0);
		
		if(rs.next()) {
			Card card = new Card();
			card.setNumberOfCard(rs.getString("id"));
			card.getMoney().setMoney(rs.getDouble("total"));
			return card;
		}
		rs.close();
		throw new NullPointerException();
	}
	
	
}
