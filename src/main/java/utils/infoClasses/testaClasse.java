package utils.infoClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class testaClasse {
	public static void main(String[] args) {
		ArrayList<ClasseTeste> cliente = new ArrayList<ClasseTeste>();
		

		ClasseTeste c2 = new ClasseTeste("Emilly", "Maringa");
		
		cliente.add(new ClasseTeste("alisson", "Baurau"));
		cliente.add(c2);
		
		for(ClasseTeste c : cliente) {
			System.out.println(c.getNome());
		}
		
		
//		System.out.println(cliente.stream().forEach(e -> System.out.print(e + " "));
//		System.out.println(""));
//		for (Iterator iterator = cliente.iterator(); iterator.hasNext();) {
//		}
	}

}
	