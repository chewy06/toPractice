import java.util.*;

class myOrderObj {
	public static void main(String[] args) {
		//obj to order
		Order ord1 = new Order(1,300, "George");
		Order ord2 = new Order(2,100, "Eric");
		Order ord3 = new Order(3,200, "Juan");
		
		//Arrya of ints
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(1);
		arr.add(100);
		arr.add(23);
		arr.add(0);
		arr.add(91);

		//print unsorted list of int's 
		System.out.println("Unsorted array of int's: " + arr);
		Collections.sort(arr);
		System.out.println("Sorted array of int's: " + arr);

		//Array of obj
		List<Order> orders = new ArrayList<Order>();
		orders.add(ord3);
		orders.add(ord1);
		orders.add(ord2);
		
		//Print unorder list
		System.out.println("Unorder list: " + orders);

		//print Natural order - ascending
		Collections.sort(orders);
		System.out.println("Ascending order: " + orders);

		//print in decending order
		Collections.sort(orders, Collections.reverseOrder());
		System.out.println("Decending order: " + orders);

		//print by order of amount
		Collections.sort(orders, new Order.OrderByAmount());
		System.out.println("Sort by amount: " + orders);
		
		//print by order of name
		Collections.sort(orders, new Order.OrderByName());
		System.out.println("Sort by name: " + orders);
	}


}

class Order implements Comparable<Order> {
	int id;
	int amount;
	String name;

	public Order(int id, int amount, String name) {
		this.id = id;
		this.amount = amount;
		this.name = name;
	}

	//Order list by amount
	public static class OrderByAmount implements Comparator<Order>{
		@Override
		public int compare(Order o1, Order o2) {
			return o1.amount > o2.amount ? 1 : (o1.amount < o2.amount ? -1 : 0);
		}
	}
	
	//Order list by name
	public static class OrderByName implements Comparator<Order> {
		@Override
		public int compare(Order o1, Order o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}

	
	public int getAmount() {return this.amount;}
	public void setAmount(int amount) {this.amount = amount;}

	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}

	//Natural order based on id
	@Override 
	public int compareTo(Order o) {
		return this.id > o.id ? 1 : (this.id < o.id ? -1 : 0);
	}

	public String toString() {
		return String.valueOf(this.id);
	}
}








