import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {

    private String name;
    private String number;

    Map<String, String> phoneBookMap = new TreeMap<>();

    public PhoneBook() {
    }


    public void inputValue() {
        for (; ; ) {
            Scanner inConsole = new Scanner(System.in);
            System.out.println("Input name: ");
            name = inConsole.nextLine();
            if (name.equals("LIST")) {
                for (Map.Entry<String,String> contact : phoneBookMap.entrySet()) {
                    System.out.println(contact);
                } break;

            }
            System.out.println("Input number: ");
            number = inConsole.nextLine();

            if (!(phoneBookMap.containsKey(name) && phoneBookMap.containsValue(number))) {
                phoneBookMap.put(name, number);
            }

        }
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: ".concat(name).concat("\n")
                .concat("Number: ").concat(number);
    }
}
