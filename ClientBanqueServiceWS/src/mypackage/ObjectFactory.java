
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Account_QNAME = new QName("http://ws.mb.com/", "account");
    private final static QName _ConversionEuroToXAF_QNAME = new QName("http://ws.mb.com/", "conversionEuroToXAF");
    private final static QName _GetAcccount_QNAME = new QName("http://ws.mb.com/", "getAcccount");
    private final static QName _ConversionEuroToXAFResponse_QNAME = new QName("http://ws.mb.com/", "conversionEuroToXAFResponse");
    private final static QName _ListAccount_QNAME = new QName("http://ws.mb.com/", "listAccount");
    private final static QName _GetAcccountResponse_QNAME = new QName("http://ws.mb.com/", "getAcccountResponse");
    private final static QName _ListAccountResponse_QNAME = new QName("http://ws.mb.com/", "listAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAccount }
     * 
     */
    public ListAccount createListAccount() {
        return new ListAccount();
    }

    /**
     * Create an instance of {@link GetAcccountResponse }
     * 
     */
    public GetAcccountResponse createGetAcccountResponse() {
        return new GetAcccountResponse();
    }

    /**
     * Create an instance of {@link ListAccountResponse }
     * 
     */
    public ListAccountResponse createListAccountResponse() {
        return new ListAccountResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToXAFResponse }
     * 
     */
    public ConversionEuroToXAFResponse createConversionEuroToXAFResponse() {
        return new ConversionEuroToXAFResponse();
    }

    /**
     * Create an instance of {@link GetAcccount }
     * 
     */
    public GetAcccount createGetAcccount() {
        return new GetAcccount();
    }

    /**
     * Create an instance of {@link ConversionEuroToXAF }
     * 
     */
    public ConversionEuroToXAF createConversionEuroToXAF() {
        return new ConversionEuroToXAF();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToXAF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "conversionEuroToXAF")
    public JAXBElement<ConversionEuroToXAF> createConversionEuroToXAF(ConversionEuroToXAF value) {
        return new JAXBElement<ConversionEuroToXAF>(_ConversionEuroToXAF_QNAME, ConversionEuroToXAF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "getAcccount")
    public JAXBElement<GetAcccount> createGetAcccount(GetAcccount value) {
        return new JAXBElement<GetAcccount>(_GetAcccount_QNAME, GetAcccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToXAFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "conversionEuroToXAFResponse")
    public JAXBElement<ConversionEuroToXAFResponse> createConversionEuroToXAFResponse(ConversionEuroToXAFResponse value) {
        return new JAXBElement<ConversionEuroToXAFResponse>(_ConversionEuroToXAFResponse_QNAME, ConversionEuroToXAFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "listAccount")
    public JAXBElement<ListAccount> createListAccount(ListAccount value) {
        return new JAXBElement<ListAccount>(_ListAccount_QNAME, ListAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "getAcccountResponse")
    public JAXBElement<GetAcccountResponse> createGetAcccountResponse(GetAcccountResponse value) {
        return new JAXBElement<GetAcccountResponse>(_GetAcccountResponse_QNAME, GetAcccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mb.com/", name = "listAccountResponse")
    public JAXBElement<ListAccountResponse> createListAccountResponse(ListAccountResponse value) {
        return new JAXBElement<ListAccountResponse>(_ListAccountResponse_QNAME, ListAccountResponse.class, null, value);
    }

}
