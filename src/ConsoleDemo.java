import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        System.out.print("请输入名称：");

        Console console = System.console();
        String name = console.readLine();
        System.out.println("您输入的名称…" + name);
        char[] passwd = console.readPassword("Password:");
        System.out.println(passwd);
    }
}