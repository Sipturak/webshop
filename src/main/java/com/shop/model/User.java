package com.shop.model;

public class User extends Person {

	private String email;
	private String password;
	private String address;
	private Card card;

	public User(String name, String lastname) {
		super(name, lastname);
		// TODO Auto-generated constructor stub
	}

	public User(String name, String lastname,String email, String password,
			String address) {
		super(name, lastname);
		this.email = email;
		this.password = password;
		this.address = address;
	}
	public User(Card card) {
		this.card = card;
	}
	
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}
	
	//change parameter from oobjec to double
	public boolean buy(double product_price) {
		
		double userMoney = card.getMoney().getTotal();
		
		if(userMoney >= product_price) {
			card.getMoney().setMoney(userMoney - product_price);
			return true;
		}	
		
		return false;
	}
	
}
