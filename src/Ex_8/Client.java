package Ex_8;

public class Client extends Person implements Printable, SeasonHandler {

    private String request;
    private boolean isAlreadyPaid;
    private boolean isSatisfied;

    public Client(String request, boolean isAlreadyPaid, boolean isSatisfied) {
        this.request = request;
        this.isAlreadyPaid = isAlreadyPaid;
        this.isSatisfied = isSatisfied;
    }

    @Override
    public void printNameAndAge() {
        System.out.println("Клиента зовут " + this.getName() + ", возраст " + this.getAge());
    }

    @Override
    public void printInfo() {
        System.out.println("Запрос клиента: " + request);
        if (isAlreadyPaid) {
            System.out.println("Клиент заплатил");
        } else System.out.println("Клиент ещё не заплатил");

        if (isSatisfied) {
            System.out.println("Клиент доволен");
        } else System.out.println("Клиент не доволен");
    }

    @Override
    public void printSeason(Season season) {
        System.out.println("У клиента сейчас " + season + ", цвет " + season.getColor());
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setAlreadyPaid(boolean alreadyPaid) {
        isAlreadyPaid = alreadyPaid;
    }

    public void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public String getRequest() {
        return request;
    }

    public boolean isAlreadyPaid() {
        return isAlreadyPaid;
    }

    public boolean isSatisfied() {
        return isSatisfied;
    }
}
