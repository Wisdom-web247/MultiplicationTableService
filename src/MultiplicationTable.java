
public class MultiplicationTable {

	public void calcMultiples(int multiple, int minMultiple, int maxMultiple) {

		for (int i = minMultiple; i <= maxMultiple; i++) {

			System.out.printf("%d * %d = %d", multiple, i, multiple * i).println();
		}

	}

}
