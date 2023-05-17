package Programs;

class Auther {
	String firstname;
	String lastname;
	Auther(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	public String getfirstname() {
		return firstname;
	}
	public String getlastname() {
		return lastname;
	}
	@Override
	public String toString() {
		return "Auther Name="+firstname+lastname;
		
	}

}