package enums;
import java.util.*;

public class EnumTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a size :(SMALL ,MEDIUM ,LARCE ,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("abbreviation= "+ size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job -- you paid attention to the _.");
    }
}

enum Size
{
    SMALL("S"),MEDIUM("M"),EXTRA_LARGE("XL");

    private Size(String abbreviation){this.abbreviation = abbreviation;}
    public String getAbbreviation(){return abbreviation;}
    private String abbreviation;
}