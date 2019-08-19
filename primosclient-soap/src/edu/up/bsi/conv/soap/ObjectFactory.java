
package edu.up.bsi.conv.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.up.bsi.conv.soap package. 
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

    private final static QName _Numero_QNAME = new QName("http://soap.conv.bsi.up.edu/", "numero");
    private final static QName _AchaPrimosResponse_QNAME = new QName("http://soap.conv.bsi.up.edu/", "acha_primosResponse");
    private final static QName _AchaPrimos_QNAME = new QName("http://soap.conv.bsi.up.edu/", "acha_primos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.up.bsi.conv.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Numero }
     * 
     */
    public Numero createNumero() {
        return new Numero();
    }

    /**
     * Create an instance of {@link AchaPrimos }
     * 
     */
    public AchaPrimos createAchaPrimos() {
        return new AchaPrimos();
    }

    /**
     * Create an instance of {@link AchaPrimosResponse }
     * 
     */
    public AchaPrimosResponse createAchaPrimosResponse() {
        return new AchaPrimosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Numero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.conv.bsi.up.edu/", name = "numero")
    public JAXBElement<Numero> createNumero(Numero value) {
        return new JAXBElement<Numero>(_Numero_QNAME, Numero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AchaPrimosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.conv.bsi.up.edu/", name = "acha_primosResponse")
    public JAXBElement<AchaPrimosResponse> createAchaPrimosResponse(AchaPrimosResponse value) {
        return new JAXBElement<AchaPrimosResponse>(_AchaPrimosResponse_QNAME, AchaPrimosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AchaPrimos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.conv.bsi.up.edu/", name = "acha_primos")
    public JAXBElement<AchaPrimos> createAchaPrimos(AchaPrimos value) {
        return new JAXBElement<AchaPrimos>(_AchaPrimos_QNAME, AchaPrimos.class, null, value);
    }

}
