package tests;
import iterator.*;

public class IteratorTestUnit {

	public static void main(String[] args) {
		NetworkMenu networkMenu = new NetworkMenu();
		Iterator iterator = networkMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Iterator Valid");
		}
		else {
			System.err.println("Iterator Invalid has not next Item");
		}

	}

}
