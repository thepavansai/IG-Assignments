public class PhoneNumber {

    private String areaCode;
    private String exchange;
    private String extension;

    public PhoneNumber(String areaCode, String exchange, String extension) {
        if (!isValidAreaCode(areaCode)) {
            throw new IllegalArgumentException("Invalid area code: " + areaCode);
        }
        if (!isValidExchange(exchange)) {
            throw new IllegalArgumentException("Invalid exchange: " + exchange);
        }
        if (!isValidExtension(extension)) {
            throw new IllegalArgumentException("Invalid extension: " + extension);
        }

        this.areaCode = areaCode;
        this.exchange = exchange;
        this.extension = extension;
    }

    private boolean isValidAreaCode(String areaCode) {
        return areaCode != null && areaCode.matches("\\d{3}");
    }

    private boolean isValidExchange(String exchange) {
        return exchange != null && exchange.matches("\\d{3}");
    }

    private boolean isValidExtension(String extension) {
        return extension != null && extension.matches("\\d{4}");
    }

    @Override
    public String toString() {
        return "(" + areaCode + ") " + exchange + "-" + extension;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneNumber other = (PhoneNumber) obj;
        return this.areaCode.equals(other.areaCode) &&
               this.exchange.equals(other.exchange) &&
               this.extension.equals(other.extension);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode.hashCode();
        result = 31 * result + exchange.hashCode();
        result = 31 * result + extension.hashCode();
        return result;
    }

    public static void main(String[] args) {
        PhoneNumber phone1 = new PhoneNumber("800", "555", "1212");
        PhoneNumber phone2 = new PhoneNumber("800", "555", "1212");
        PhoneNumber phone3 = new PhoneNumber("900", "555", "1212");

        System.out.println(phone1);
        System.out.println(phone1.equals(phone2));
        System.out.println(phone1.equals(phone3));

        try {
            new PhoneNumber("12", "555", "1212");
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating phone number: " + e.getMessage());
        }
    }
}
