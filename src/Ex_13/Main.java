package Ex_13;

public class Main {
    public static void main(String[] args) {
        StringBuilder poem = new StringBuilder();
        poem.append("Some say ");
        poem.append("the world will ");
        poem.append("end in fire,\n");
        poem.append("Some say in ice.\n");

        poem.insert(poem.indexOf(".") + 2, "From what I've tasted of desire\n");
        poem.append("I hold with those who favour fire.\n");

        poem.insert(poem.lastIndexOf(".") + 2, "But if it had to perish twice, \n");
        poem.append("I think I know enough of hate\n");

        poem.insert(poem.indexOf("hate") + 5, "To say that for destruction ice\n");
        poem.append("Is also great...\n");
        System.out.println(poem);

        String phoneNumber = "+79161234567";
        String eMail = "somebody@gmail.com";

        phoneNumber = phoneNumber.replaceAll("(?<=\\d{2})\\d(?=\\d{2})", "*");
        System.out.println(phoneNumber);

        eMail = eMail.replaceAll("(?<=.{2}).(?=[^@]*?@)", "*");
        System.out.println(eMail);
    }
}
