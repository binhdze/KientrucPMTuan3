package Bai2;

class VATTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.10;
    }
}
