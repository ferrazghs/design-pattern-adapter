package mercadopago;

import utils.Token;

public interface IMercadoPagoPayment {

    Token getToken();

    void realizarPagamento();

    void receberPagamento();
}
