package in.ashokit.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOpertions {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Smith", 10000));
		empList.add(new Employee(102, "John", 5000));
		empList.add(new Employee(103, "Maxwell", 2500));
		empList.add(new Employee(104, "Faf", 3400));
		empList.add(new Employee(105, "kohil", 6500));

		List<Employee> sortedListAscendingOrder = empList.stream()
				.sorted((o1, o2) -> (int) (o1.getEmpSalary() - o2.getEmpSalary())).collect(Collectors.toList());
		System.out.println(sortedListAscendingOrder);

		System.out.println("======================");
		List<Employee> sortedListDescendingOrder = empList.stream()
				.sorted((o1, o2) -> (int) (o2.getEmpSalary() - o1.getEmpSalary())).limit(3)
				.collect(Collectors.toList());
		System.out.println(sortedListDescendingOrder);

		System.out.println("============================");

		Optional<Employee> minSalary = empList.stream()
				.min((i1, i2) -> (i1.getEmpSalary() > i2.getEmpSalary() ? 1 : -1));
		if (minSalary.isPresent()) {
			Employee emp = minSalary.get();
			System.out.println(emp);
		}

		empList.stream().findFirst().ifPresent(System.out::println);

		Optional<Employee> findAny = empList.stream().findAny();
		if (findAny.isPresent()) {
			Employee emp = findAny.get();
			System.out.println(emp);
		}

		System.out.println("Sort the names ");
		List<Employee> sortNames = empList.stream()
				.sorted((i1, i2) -> i1.getEmpName().toLowerCase().compareTo(i2.getEmpName().toLowerCase()))
				.collect(Collectors.toList());
		System.out.println(sortNames);
		
		
		System.out.println("==========================================");
		empList.stream().sorted((i1, i2) -> i1.getEmpName().toLowerCase().compareTo(i2.getEmpName().toLowerCase()))
				.forEach(name -> System.out.println(name.getEmpName()));
		
		long count = empList.stream().count();
		System.out.println(count);
		

	}
}

class SortSalary implements Comparable<Employee> {

	@Override
	public int compareTo(Employee o) {

		return (int) (o.getEmpSalary() - o.getEmpSalary());
	}

}
