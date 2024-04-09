package payoneer;

import utils.Token;

public interface IPayoneerPayment {

    Token getToken();

    void sendPayment();

    void receivePayment();
}
