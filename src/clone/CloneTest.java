package clone;

//import interfaces.Employee;  //这句代码是编译器自动添加的，导致不能运行？why?

public class CloneTest {
    public static void main(String [] args)
    {
        try
        {
            Employee original = new Employee("John Q ,public",50000);
            original.setHireDay(2000,1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);
            System.out.println("original="+original);
            System.out.println("copy= "+copy);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }

}
