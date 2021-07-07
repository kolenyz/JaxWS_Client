package sud.webservices;

public interface ProductService extends javax.xml.rpc.Service {
    public java.lang.String getProductsManagerImplPortAddress();

    public sud.webservices.ProductsManagerImpl getProductsManagerImplPort() throws javax.xml.rpc.ServiceException;

    public sud.webservices.ProductsManagerImpl getProductsManagerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}