package Ex_8;

public class Client extends Person implements Printable, SeasonHandler {

    private String request;
    private boolean isAlreadyPaid;
    private boolean isSatisfied;

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
