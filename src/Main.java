import adapters.MercadoPagoAdapter;
import mercadopago.MercadoPago;
import paypal.IPayPalPayment;

public class Main {
    public static void main(String[] args) {


        IPayPalPayment payment = new MercadoPagoAdapter(new MercadoPago());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}