package com.keeggo.demo_rest.model;

public class CustomerCarrinho {
	
	private String color; 
	private String productId; 
	private String quantidade; 
	private String userId;
	
	/**
	 * @param color
	 * @param productId
	 * @param quantidade
	 * @param userId
	 */
	public CustomerCarrinho(String color, String productId, String quantidade, String userId) {
		this.color = color;
		this.productId = productId;
		this.quantidade = quantidade;
		this.userId = userId;
	}
	
	public CustomerCarrinho() {
	
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
