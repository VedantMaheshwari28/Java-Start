public class Employees{
	private static int i=1;
	private String name;
	private double salary;
	private int id;
	public Employees(String n,double s){
		name=n;
		salary=s
		id=i++;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setName(String nam) {
		name=nam;
	}
	public void setSalary(double sal) {
		salary=sal;
	}
	public void setId(int j) {
	public double promotionPercentage(double f) {
		salary+=salary*f/100;
		return salary;
	}
	public void fire() {
		id=0;
		name= " ";
		salary = 0.0;
	}
	public double demotionPercentage(double d) {
		salary -= salary*d/100;
		return salary;
	}
}