package RevisaoComIterator;

import java.util.Iterator;

public class Utils {
	public static void removePorNome(Iterator<?> ite, String nome) {
		while (ite.hasNext()) {
			Object o1 = ite.next();
			if (o1.toString().contains(nome)) {
				ite.remove();
			}
		}
	}
	
	public static Object consultaPorNome(Iterator<?> ite, String nome) {
		while (ite.hasNext()) {
			Object o1 = ite.next();
			if (o1.toString().contains(nome)) {
				return o1;
			}
		}
		return null;
	}
}
