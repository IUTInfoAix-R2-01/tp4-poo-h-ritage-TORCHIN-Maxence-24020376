package tpexosYaip7;

public class DiscountRate {
    private double serviceDiscountPremium() {
        return 0.2;
    }

    private double serviceDiscountGold() {
        return 0.15;
    }

    private double serviceDiscountSilver() {
        return 0.1;
    }

    private double productDiscountPremium() {
        return 0.1;
    }

    private double productDiscountGold() {
        return 0.1;
    }

    private double productDiscountSilver() {
        return 0.1;
    }

    public double getServiceDiscountRate(String type) {
        if (type.equalsIgnoreCase("Premium")) {
            return serviceDiscountPremium();
        }
        else if (type.equalsIgnoreCase("Gold")) {
            return serviceDiscountGold();
        }
        else if (type.equalsIgnoreCase("Silver")) {
            return serviceDiscountSilver();
        }
        else {
            return 0.0;
        }
    }

    public double getProductDiscountRate(String type) {
        if (type.equalsIgnoreCase("Premium")) {
            return productDiscountPremium();
        }
        else if (type.equalsIgnoreCase("Gold")) {
            return productDiscountGold();
        }
        else if (type.equalsIgnoreCase("Silver")) {
            return productDiscountSilver();
        }
        else {
            return 0.0;
        }
    }
    
    public static void main(String[] args) {
        DiscountRate dr = new DiscountRate();

        System.out.println("Service Discount (Premium): " + dr.getServiceDiscountRate("Premium"));
        System.out.println("Service Discount (Gold): " + dr.getServiceDiscountRate("Gold"));
        System.out.println("Service Discount (Silver): " + dr.getServiceDiscountRate("Silver"));
        System.out.println("Service Discount (None): " + dr.getServiceDiscountRate("None"));

        System.out.println("Product Discount (Premium): " + dr.getProductDiscountRate("Premium"));
        System.out.println("Product Discount (Gold): " + dr.getProductDiscountRate("Gold"));
        System.out.println("Product Discount (Silver): " + dr.getProductDiscountRate("Silver"));
        System.out.println("Product Discount (None): " + dr.getProductDiscountRate("None"));
    }
}
