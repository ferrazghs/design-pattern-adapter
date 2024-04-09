package payoneer;

import utils.Token;

public class Payoneer implements IPayoneerPayment {
    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        getToken();
        System.out.println("Realizando pagamento via Payoneer ");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via Payoneer");
    }
}
