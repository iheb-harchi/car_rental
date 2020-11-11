package com.car.rental.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class OrderData {

	private long id;
	private long userId;
	private long carId;
	private Date orderDate;
	private Date returnDate;
	private boolean carReturned;
	private BigDecimal rentalCost;
	
	public OrderData() {
		super();
	}

	public OrderData(long userId, long carId, Date orderDate, Date returnDate, boolean carReturned,
			BigDecimal rentalCost) {
		this.userId = userId;
		this.carId = carId;
		this.orderDate = orderDate;
		this.returnDate = returnDate;
		this.carReturned = carReturned;
		this.rentalCost = rentalCost;
	}

	public OrderData(long id, long userId, long carId, Date orderDate, Date returnDate, boolean carReturned,
			BigDecimal rentalCost) {
		super();
		this.id = id;
		this.userId = userId;
		this.carId = carId;
		this.orderDate = orderDate;
		this.returnDate = returnDate;
		this.carReturned = carReturned;
		this.rentalCost = rentalCost;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isCarReturned() {
		return carReturned;
	}

	public void setCarReturned(boolean carReturned) {
		this.carReturned = carReturned;
	}

	public BigDecimal getRentalCost() {
		return rentalCost;
	}

	public void setRentalCost(BigDecimal rentalCost) {
		this.rentalCost = rentalCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carId ^ (carId >>> 32));
		result = prime * result + (carReturned ? 1231 : 1237);
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((rentalCost == null) ? 0 : rentalCost.hashCode());
		result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderData other = (OrderData) obj;
		if (carId != other.carId)
			return false;
		if (carReturned != other.carReturned)
			return false;
		if (id != other.id)
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (rentalCost == null) {
			if (other.rentalCost != null)
				return false;
		} else if (!rentalCost.equals(other.rentalCost))
			return false;
		if (returnDate == null) {
			if (other.returnDate != null)
				return false;
		} else if (!returnDate.equals(other.returnDate))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderData [id=" + id + ", userId=" + userId + ", carId=" + carId + ", orderDate=" + orderDate
				+ ", returnDate=" + returnDate + ", carReturned=" + carReturned + ", rentalCost=" + rentalCost + "]";
	}
	
	

}
