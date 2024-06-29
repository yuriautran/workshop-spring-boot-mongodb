package com.nelioalves.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Date date;
	private String title;
	private String boyd;
	private User author;
	
	public Post() {
		
	}

	public Post(String id, Date date, String title, String boyd, User author) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.boyd = boyd;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoyd() {
		return boyd;
	}

	public void setBoyd(String boyd) {
		this.boyd = boyd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}
}
