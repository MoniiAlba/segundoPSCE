/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstprod160502meag;

import man.Product;



/**
 *
 * @author sdist
 */
public class TstProd160502MEAG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("======================4.1=====================");
        System.out.println("====================== Catalogo de productos =====================");
        java.util.List<product.Product> listaProd = findAllProd();
        System.out.println(listaProd.size());
        listaProd.forEach(prod ->{
            System.out.println("Producto con id "+prod.getProductId() +
                    " del fabricante "+prod.getManufacturerId().getName());
            System.out.println("Código del producto: " + prod.getProductCode().getProdCode());
            System.out.println("Costo de compra: "+ prod.getPurchaseCost());
            System.out.println("Cantidad en almacen: "+prod.getQuantityOnHand());
            System.out.println("Markup: "+prod.getMarkup());
            System.out.println("Disponible: "+prod.getAvailable());
            System.out.println("Desctripción: "+prod.getDescription());
            System.out.println("\n \n");
        });
        
        java.util.List<man.Product> lm = findAllMan();
        System.out.println(lm.size());
        /*
        lm.forEach(man ->{
            man.Manufacturer id = man.getManufacturerId();
            findMan(id);
            System.out.println();        });
        
        java.util.List<prodCode.Product> lPC = findAllPC();
        lPC.forEach(obj -> {
            System.out.println(obj.getDescription());
        });
        */
        
        System.out.println("======================4.2=====================");
        //producto a modificar:
        product.Product prod = listaProd.get(0);
        System.out.println("Producto a modificar tiene código: "+prod.getProductCode().getProdCode());
        System.out.println("Cantidad anterior: "+prod.getQuantityOnHand());
        prod.setQuantityOnHand(prod.getQuantityOnHand() - 5);
        System.out.println("Cantidad nueva: "+prod.getQuantityOnHand());
        
    }

    private static java.util.List<man.Product> findAllMan() {
        man.WSManufacturer_Service service = new man.WSManufacturer_Service();
        man.WSManufacturer port = service.getWSManufacturerPort();
        return port.findAll();
    }

    private static java.util.List<product.Product> findAllProd() {
        product.WSProduct_Service service = new product.WSProduct_Service();
        product.WSProduct port = service.getWSProductPort();
        return port.findAll();
    }

    private static java.util.List<prodCode.Product> findAllPC() {
        prodCode.WSProdCode_Service service = new prodCode.WSProdCode_Service();
        prodCode.WSProdCode port = service.getWSProdCodePort();
        return port.findAll();
    }

    private static Product findMan(java.lang.Object id) {
        man.WSManufacturer_Service service = new man.WSManufacturer_Service();
        man.WSManufacturer port = service.getWSManufacturerPort();
        return port.find(id);
    }
    
}
