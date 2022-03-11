package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
    
    private String discountCause;

    private Money value;
    
    public Discount(Money money, String discountCause) {
        this.value = money;
        this.discountCause = discountCause;
    }

    public Money getMoney() {
        return value;
    }
    
    public void setMoney(Money money) {
        this.value = money;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public void setDiscountCause(String discountCause) {
        this.discountCause = discountCause;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((discountCause == null) ? 0 : discountCause.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Discount other = (Discount) obj;
        if (discountCause == null) {
            if (other.discountCause != null)
                return false;
        } else if (!discountCause.equals(other.discountCause))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
}
