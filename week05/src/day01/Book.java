package day01;

import java.util.Objects;

public class Book {
	
	private String title;
	private Person author;
	private boolean isHardcover;
	
	public Book() {
		title = "TBD";
		author = new Person("anonymous", 1970);
	}
	
	public Book(String title, Person author) {
		this.title = title;
		this.author = author;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}
	
	public void setIsHardcover(boolean isHardcover) {
		this.isHardcover = isHardcover;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book is " + title + " by " + author;
	}

}
