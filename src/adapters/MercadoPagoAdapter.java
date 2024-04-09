package adapters;

import mercadopago.MercadoPago;
import paypal.IPayPalPayment;
import utils.Token;

public class MercadoPagoAdapter implements IPayPalPayment {

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.realizarPagamento();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.receberPagamento();
    }
}
