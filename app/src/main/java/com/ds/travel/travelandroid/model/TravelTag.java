package com.ds.travel.travelandroid.model;
// Generated Oct 7, 2016 12:53:25 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * TravelTag generated by hbm2java
 */
public class TravelTag implements java.io.Serializable {

	private int id;
	private Tag tag;
	private Travel travel;

	public TravelTag() {
	}

	public TravelTag(int id) {
		this.id = id;
	}

	public TravelTag(int id, Tag tag, Travel travel) {
		this.id = id;
		this.tag = tag;
		this.travel = travel;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public Travel getTravel() {
		return this.travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

}
