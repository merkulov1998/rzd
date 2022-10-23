
package ru.rzd.train;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TrainService", targetNamespace = "http://train.rzd.ru", wsdlLocation = "file:/C:/Users/Admin/Desktop/rzd/src/main/resources/wsdl/Train.wsdl")
public class TrainService
    extends Service
{

    private final static URL TRAINSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRAINSERVICE_EXCEPTION;
    private final static QName TRAINSERVICE_QNAME = new QName("http://train.rzd.ru", "TrainService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Admin/Desktop/rzd/src/main/resources/wsdl/Train.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRAINSERVICE_WSDL_LOCATION = url;
        TRAINSERVICE_EXCEPTION = e;
    }

    public TrainService() {
        super(__getWsdlLocation(), TRAINSERVICE_QNAME);
    }

    public TrainService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRAINSERVICE_QNAME, features);
    }

    public TrainService(URL wsdlLocation) {
        super(wsdlLocation, TRAINSERVICE_QNAME);
    }

    public TrainService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRAINSERVICE_QNAME, features);
    }

    public TrainService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrainService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TrainInterface
     */
    @WebEndpoint(name = "TrainServiceSOAP")
    public TrainInterface getTrainServiceSOAP() {
        return super.getPort(new QName("http://train.rzd.ru", "TrainServiceSOAP"), TrainInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrainInterface
     */
    @WebEndpoint(name = "TrainServiceSOAP")
    public TrainInterface getTrainServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://train.rzd.ru", "TrainServiceSOAP"), TrainInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRAINSERVICE_EXCEPTION!= null) {
            throw TRAINSERVICE_EXCEPTION;
        }
        return TRAINSERVICE_WSDL_LOCATION;
    }

}
