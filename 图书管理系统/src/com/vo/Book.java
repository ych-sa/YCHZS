/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vo;

/**
 *
 * @author ASUS
 */
public class Book {
        private String bookId;
	private String bookName;
	private String author;
	private String publishingName;
	private String publishingDate;
	private String status;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishingName() {
		return publishingName;
	}
	public void setPublishingName(String publishingName) {
		this.publishingName = publishingName;
	}
	public String getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void changeAttribute(){
                this.bookId="%"+ this.bookId+"%";
                this.bookName="%"+this.bookName+"%";
                this.author="%"+this.author+"%";
                this.publishingName="%"+this.publishingName+"%";
                this.publishingDate="%"+this.publishingDate+"%";
                this.status="%"+this.status+"%";
        }
	
}
