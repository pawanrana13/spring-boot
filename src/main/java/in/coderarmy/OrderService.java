package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService payment;
    @Autowired
    public OrderService(PaymentService payment) {
        this.payment = payment;
    }

    void placeOrder(){
        payment.Pay();
        System.out.println("Order placed");
    }
}
