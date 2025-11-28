package promowarn.common.mail;

/**
 * An EMailAddress is just the encapsulation of a String.
 */
public final class EMailAddress {

    private String address;

    public EMailAddress(String address) {
        this.address = address;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.address();
    }
}
