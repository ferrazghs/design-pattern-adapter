package paypal;

import utils.Token;

public interface IPayPalPayment {

    Token getToken();

    void paypalPayment();

    void paypalReceive();
}
