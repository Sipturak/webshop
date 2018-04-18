package com.shop.model;

public class Card {
	
	public Card() {}
	
	public Card(Money money, String numberOfCard) {
		super();
		this.money = money;
		this.numberOfCard = numberOfCard;
	}

	//static class
	public static class Money {

		private double total;

		public void setMoney(double total) {
			this.total = total;
			;
		}

		public double getTotal() {
			return total;
		}
	}
	//end
		
	private Money money = new Money();
	private String numberOfCard;

	public Money getMoney() {
		return money;
	}

	public String getNumberOfCard() {
		return numberOfCard;
	}

	public void setNumberOfCard(String numberOfCard) {
		this.numberOfCard = numberOfCard;
	}

}
