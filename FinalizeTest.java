
public class FinalizeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pe = new Person("Tom",99);
		pe = null;
		System.gc();
	}

}
