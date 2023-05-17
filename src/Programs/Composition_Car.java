package Programs;
class Engine {
	private String engineType;
	private String engineName;
	private String enginePower;
	
	public Engine(String engineType, String engineName, String enginePower) {
		super();
		this.engineType = engineType;
		this.engineName = engineName;
		this.enginePower = enginePower;
		
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", engineName=" + engineName + ", enginePower=" + enginePower + "]";
	}
	
}	
class Composition_Car {
	
    public static void main(String[] args) {
		Engine CE=new Engine("V8","Chevvy","320 BHP");
	}

	

}
