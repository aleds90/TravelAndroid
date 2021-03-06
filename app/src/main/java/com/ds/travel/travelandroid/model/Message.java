package com.ds.travel.travelandroid.model;
// Generated Oct 7, 2016 12:53:25 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * Message generated by hbm2java
 */
public class Message implements java.io.Serializable {

	private Integer id;
	private Travel travel;
	private User user;
	private String text;
	private Date createdAt;
	private Date updatedAt;

	public Message() {
	}

	public Message(Travel travel, User user, String text, Date createdAt, Date updatedAt) {
		this.travel = travel;
		this.user = user;
		this.text = text;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Travel getTravel() {
		return this.travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
