/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import ejb.Manufacturer;
import ejb.ManufacturerFacade;
import ejb.Product;
import ejb.ProductCode;
import ejb.ProductCodeFacade;
import ejb.ProductFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "WSTodo")
public class WSTodo {

    //PRODUCTOS
    @EJB
    private ProductFacade ejbRefP;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void createP(@WebParam(name = "entity") Product entity) {
        ejbRefP.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void editP(@WebParam(name = "entity") Product entity) {
        ejbRefP.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void removeP(@WebParam(name = "entity") Product entity) {
        ejbRefP.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Product findP(@WebParam(name = "id") Object id) {
        return ejbRefP.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Product> findAllP() {
        return ejbRefP.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Product> findRangeP(@WebParam(name = "range") int[] range) {
        return ejbRefP.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int countP() {
        return ejbRefP.count();
    }
    
    //MANUFACTURER
    @EJB
    private ManufacturerFacade ejbRefM;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void createM(@WebParam(name = "entity") Manufacturer entity) {
        ejbRefM.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void editM(@WebParam(name = "entity") Manufacturer entity) {
        ejbRefM.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void removeM(@WebParam(name = "entity") Manufacturer entity) {
        ejbRefM.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Manufacturer findM(@WebParam(name = "id") Object id) {
        return ejbRefM.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Manufacturer> findAllM() {
        return ejbRefM.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Manufacturer> findRangeM(@WebParam(name = "range") int[] range) {
        return ejbRefM.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int countM() {
        return ejbRefM.count();
    }
    
    @EJB
    private ProductCodeFacade ejbRefPC;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void createPC(@WebParam(name = "entity") ProductCode entity) {
        ejbRefPC.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void editPC(@WebParam(name = "entity") ProductCode entity) {
        ejbRefPC.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void removePC(@WebParam(name = "entity") ProductCode entity) {
        ejbRefPC.remove(entity);
    }

    
    @WebMethod(operationName = "find")
    public ProductCode findPC(@WebParam(name = "id") Object id) {
        return ejbRefPC.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<ProductCode> findAllPC() {
        return ejbRefPC.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<ProductCode> findRangePC(@WebParam(name = "range") int[] range) {
        return ejbRefPC.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int countPC() {
        return ejbRefPC.count();
    }


}
