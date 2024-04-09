package adapters;

import payoneer.Payoneer;
import paypal.IPayPalPayment;
import utils.Token;

public class PayoneerAdapter implements IPayPalPayment {

    private final Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
    }

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        payoneer.receivePayment();
    }
}
