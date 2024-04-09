package paypal;

import utils.Token;

public class PayPal implements IPayPalPayment {
    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        getToken();
        System.out.println("Realizando pagamento via Paypal ");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamento via PayPal");
    }
}
