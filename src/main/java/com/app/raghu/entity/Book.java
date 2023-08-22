package com.app.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booktab")
public class Book {
	@Id
	@Column(name="bid")
	private Integer bookId;
	
	@Column(name="bname")
	private String bookName;

	@Column(name="bauth")
	private String author;
	
	@Column(name="bcost")
	private Double bookCost;
	
	@Column(name="btype")
	private String bookType;

	public Book(Integer bookId, String bookName, String author, Double bookCost, String bookType) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookCost = bookCost;
		this.bookType = bookType;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", bookCost=" + bookCost
				+ ", bookType=" + bookType + "]";
	}
	
}
