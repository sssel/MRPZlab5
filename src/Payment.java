import java.util.Calendar;

public class Payment {
    private String deliveryAddress;
    private Calendar paymentDate;

    public double getTotalPayable(ShoppingCart shoppingCart) {
        return getShippingCost()+shoppingCart.getTotalPayable();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Calendar getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getShippingCost() {
        return deliveryAddress.length()*5;
    }

    class ShoppingCart{
        private int numberOfGoods;

        public int getNumberOfGoods() {
            return numberOfGoods;
        }

        public void setNumberOfGoods(int numberOfGoods) {
            this.numberOfGoods = numberOfGoods;
        }

        public double getPrice() {
            return getNumberOfGoods()*33;
        }


        public double getDiscount() {
            if (getNumberOfGoods() > 20) return 50;
            if (getNumberOfGoods() > 10) return 20;
            return 0;
        }


        public double getTotalPayable() {
            return getPrice()-getDiscount();
        }
    }
}
