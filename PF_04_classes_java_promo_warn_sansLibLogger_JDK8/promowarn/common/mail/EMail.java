package promowarn.common.mail;

/**
 * An EMail is a title and an EMailAddress to send the EMail to.
 */
public final class EMail {
    private EMailAddress toAddress;
    private String title;

    public EMail(EMailAddress toAddress, String title) {
        this.toAddress = toAddress;
        this.title = title;
    }

    public EMailAddress toAddress() {
        return toAddress;
    }

    public void setToAddress(EMailAddress toAddress) {
        this.toAddress = toAddress;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
