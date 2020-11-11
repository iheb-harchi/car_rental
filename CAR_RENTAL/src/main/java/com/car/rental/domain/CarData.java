package com.car.rental.domain;

public class CarData {
	private long carId;
	private String model;
	private String releaseYear;
	private String color;
	private String company;
	

	public CarData() {
		super();
	}


	public CarData(String model, String releaseYear, String color, String company) {
		super();
		this.model = model;
		this.releaseYear = releaseYear;
		this.color = color;
		this.company = company;
	}


	public CarData(long carId, String model, String releaseYear, String color, String company) {
		super();
		this.carId = carId;
		this.model = model;
		this.releaseYear = releaseYear;
		this.color = color;
		this.company = company;
	}


	public long getCarId() {
		return carId;
	}


	public void setCarId(long carId) {
		this.carId = carId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (carId ^ (carId >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((releaseYear == null) ? 0 : releaseYear.hashCode());
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
		CarData other = (CarData) obj;
		if (carId != other.carId)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (releaseYear == null) {
			if (other.releaseYear != null)
				return false;
		} else if (!releaseYear.equals(other.releaseYear))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CarData [carId=" + carId + ", model=" + model + ", releaseYear=" + releaseYear + ", color=" + color
				+ ", company=" + company + "]";
	}
	
	
	
}