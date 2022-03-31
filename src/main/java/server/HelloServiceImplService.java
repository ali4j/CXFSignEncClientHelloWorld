
package server;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloServiceImplService", targetNamespace = "http://server.service.ali4j.net/", wsdlLocation = "file:/F:/workspace/CXFSignEncClientHelloWorld/src/wsdl/helloService.wsdl")
public class HelloServiceImplService
    extends Service
{

    private final static URL HELLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HELLOSERVICEIMPLSERVICE_QNAME = new QName("http://server.service.ali4j.net/", "HelloServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/F:/workspace/CXFSignEncClientHelloWorld/src/wsdl/helloService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HELLOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HelloServiceImplService() {
        super(__getWsdlLocation(), HELLOSERVICEIMPLSERVICE_QNAME);
    }

    public HelloServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOSERVICEIMPLSERVICE_QNAME, features);
    }

    public HelloServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOSERVICEIMPLSERVICE_QNAME);
    }

    public HelloServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOSERVICEIMPLSERVICE_QNAME, features);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort() {
        return super.getPort(new QName("http://server.service.ali4j.net/", "HelloServiceImplPort"), HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.service.ali4j.net/", "HelloServiceImplPort"), HelloService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HELLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}