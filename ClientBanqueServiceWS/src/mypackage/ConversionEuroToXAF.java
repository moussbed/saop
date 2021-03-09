
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour conversionEuroToXAF complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="conversionEuroToXAF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionEuroToXAF", propOrder = {
    "account"
})
public class ConversionEuroToXAF {

    protected double account;

    /**
     * Obtient la valeur de la propriété account.
     * 
     */
    public double getAccount() {
        return account;
    }

    /**
     * Définit la valeur de la propriété account.
     * 
     */
    public void setAccount(double value) {
        this.account = value;
    }

}
