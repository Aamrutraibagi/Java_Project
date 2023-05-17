package Programs;

class SwingException extends Exception{}
class CloseException extends Exception{}

class Door implements AutoCloseable{
	
	public void Swing() throws SwingException{
		System.out.println("Door is Swinging");
		throw new SwingException();
	}

	@Override
	public void close() throws CloseException {
		System.out.println("Door is Closed");
		throw new CloseException();
	}
	
}
public class MyHome {
	static Door Door=null;
	public static void main(String[] args) {
		try(Door D=new Door();) {
			D.Swing();
			
		}
		catch(Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getSuppressed()[0]);
		}
		finally {
			try {
				if(Door!=null) {
					Door.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
