package com.nt.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductList {

	public static void main(String[] args) {
		Product p1 = new Product(101, "python", "book", 200l);
		Product p2 = new Product(102, "java", "book", 230l);
		Product p3 = new Product(103, "datastructures", "book", 150l);
		Product p4 = new Product(104, "c++", "book", 120l);
		Product p5 = new Product(105, "ipod", "earphone", 299l);
		Product p6 = new Product(106, "laptop table", "Table", 350l);
		Product p7 = new Product(107, "samsung", "phone", 2500l);
		Product p8 = new Product(108, "redmi", "phone", 3000l);
		Product p9 = new Product(109, "oppo", "phone", 4500l);
		//	Product p10 = new Product(109, "oppo", "phone", 4500l);

		List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);

		/*List<Product> booksList = productList.stream().filter((c) -> c.getCategory().equalsIgnoreCase("book"))
				.filter((c) -> c.getPcost() > 200).collect(Collectors.toList());
		for (Product p : booksList) {
			System.out.println(p.getPid() + "  " + p.getPname() + "   " + p.getCategory() + "  " + p.getPcost());
		}
		System.out.println("==================================================================================");
		Set<Product> bookSet = productList.stream().filter((c) -> c.getCategory().equalsIgnoreCase("book"))
				.filter((i1) -> i1.getPcost() < 200).collect(Collectors.toSet());
		
		for (Product p : bookSet) {
			System.out.println(p.getPid() + "  " + p.getPname() + "   " + p.getCategory() + "  " + p.getPcost());
		}
		
		List<Product> sortlist = productList.stream().sorted(Comparator.comparing(Product::getPcost))
				.collect(Collectors.toList());
		sortlist.forEach(System.out::println);
		
		for (Product p : sortlist) {
			System.out.println(p.getPid() + "  " + p.getPname() + "   " + p.getCategory() + "  " + p.getPcost());
		}
		
		List<Product> sortList1 = productList.stream().sorted(Comparator.comparingLong(Product::getPcost).reversed())
				.collect(Collectors.toList());
		
		for (Product p : sortList1) {
			System.out.println(p.getPid() + "  " + p.getPname() + "   " + p.getCategory() + "  " + p.getPcost());
		
		}
		sortList1.forEach(System.out::println);
		
		sortList1.forEach((p) -> System.out
				.println(p.getPid() + "  " + p.getPname() + "   " + p.getCategory() + "  " + p.getPcost()));
		
		System.out.println("=======================================");
		productList.stream().sorted(Comparator.comparing(Product::getPname)).collect(Collectors.toList())
				.forEach((p) -> System.out
						.println(p.getPid() + "  " + p.getPname() + "   " + p.getCategory() + "  " + p.getPcost()));
		*/
		/*List<Product> phoneList = productList.stream().filter((p) -> p.getCategory().equalsIgnoreCase("phone"))
				.filter((pcost) -> pcost.getPcost() >= 3000).collect(Collectors.toList());
		phoneList.forEach((p) -> System.out
				.println(p.getPid() + "  " + p.getPname() + "   " + p.getPcost() + "   " + p.getCategory()));
		
		// to get the maximum product in list
		Product maxProduct = productList.stream().max(Comparator.comparingLong(Product::getPcost))
				.filter((p) -> p.getCategory().equalsIgnoreCase("phone")).get();
		
		System.out.println(maxProduct);*/

		/*Product minProd = productList.stream().min(Comparator.comparingLong(Product::getPcost))
				.filter((p) -> p.getCategory().equalsIgnoreCase("phone")).get();
		
		System.out.println(minProd);
		
		// to get the maximum product in book List
		Product maxProductBook = productList.stream().max(Comparator.comparingLong(Product :: getPcost))
				.filter((p) -> p.getCategory().equalsIgnoreCase("book")).get();
		System.out.println(maxProductBook);
		 */

		/*Optional<Product> minProd = productList.stream().min((i1, i2) -> i1.getPcost().compareTo(i2.getPcost()))
				.filter((i1) -> i1.getCategory().equalsIgnoreCase("phone"));
		System.out.println(minProd);*/

		productList.stream().sorted(Comparator.comparing(Product::getPcost)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("=====================================");
		Product product = productList.stream().filter((i1) -> i1.getCategory().equalsIgnoreCase("phone"))
				.max(Comparator.comparing(Product::getPcost)).get();
		System.out.println(product);

		long count = productList.stream().count();

		System.out.println(count);

		productList.stream().filter((i1) -> i1.getCategory().equalsIgnoreCase("book")).limit(2)
				.collect(Collectors.toList()).forEach(System.out::println);
		productList.stream().filter((i1) -> i1.getCategory().equalsIgnoreCase("book")).skip(2)
				.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==============================================");
		//productList.stream().distinct().filter((i1)->i1.getCategory().equalsIgnoreCase("phone")) .collect(Collectors.toList()).forEach(System.out :: println);

		Product product2 = productList.stream().findFirst().get();
		System.out.println(product2);

		Product product3 = productList.stream().findAny().get();
		System.out.println(product3);

		//productList.stream().allMatch((p1) ->p1.getCategory().contains("phone"));
		Predicate<Product> p = e -> p1.getPname().startsWith("r");

		boolean match = productList.stream().anyMatch(p);
		System.out.println(match);
	}
}