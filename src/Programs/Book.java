package Programs;

class Book {
	String title;
	String auther;
	double price;
	

	Book(String title, String auther,double price) {
		this.title=title;
		this.auther=auther;
		this.price=price;
		
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuther(String auther) {
		this.auther=auther;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuther() {
		return auther;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book Details:-- "+"Book Title="+title+", Auther Name="+auther+", Price="+price;
		
	}

}

