package mercadopago;

import utils.Token;

public class MercadoPago implements IMercadoPagoPayment {
    @Override
    public Token getToken() {
        return new Token();
    }

    @Override
    public void realizarPagamento() {
        getToken();
        System.out.println("Realizando pagamento via Mercado Pago ");
    }

    @Override
    public void receberPagamento() {
        System.out.println("Recebendo pagamento via Mercado Pago");
    }
}
