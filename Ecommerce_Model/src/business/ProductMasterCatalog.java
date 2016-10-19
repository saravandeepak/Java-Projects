/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class ProductMasterCatalog {
    private ArrayList <ProductMaster> productMasterCatalog;
 

    public ProductMasterCatalog() {
        this.productMasterCatalog = new ArrayList<ProductMaster>();
      
    }

    public ArrayList<ProductMaster> getProductMasterCatalog() {
        return productMasterCatalog;
    }

    public void setProductMasterCatalog(ArrayList<ProductMaster> productMasterCatalog) {
        this.productMasterCatalog = productMasterCatalog;
    }

    public void addProduct(ProductMaster product){
        productMasterCatalog.add(product);
    }
    
    public void deleteProduct(ProductMaster product){
        productMasterCatalog.remove(product);
    }
    
    public ArrayList<ProductMaster> searchProduct(String searchText){
        ArrayList<ProductMaster> productArray = new ArrayList<ProductMaster>();
        for (ProductMaster product: productMasterCatalog){
            if (product.getProductName().toLowerCase().contains(searchText.toLowerCase()) || product.getModelNo().toLowerCase().contains(searchText.toLowerCase()) || product.getVendorName().toLowerCase().contains(searchText.toLowerCase()) || product.getProductCategory().toLowerCase().contains(searchText.toLowerCase()) || product.getProductDescription().toLowerCase().contains(searchText.toLowerCase()) || product.getProductFeatures().toLowerCase().contains(searchText.toLowerCase())){
                productArray.add(product);
            }   
        }
        return productArray;
    }
    
    public ArrayList<ProductMaster> searchProduct(String productName, String modelNo, String vendor, double minPrice, double maxPrice, String keyWords, String category){
        ArrayList<ProductMaster> productArray = new ArrayList<ProductMaster>();
        for (ProductMaster product: productMasterCatalog){
            if((product.getProductName().toLowerCase().contains(productName.toLowerCase())||productName.equals("") ) && (product.getModelNo().toLowerCase().equals(modelNo.toLowerCase())||modelNo.equals("")) && (product.getVendorName().toLowerCase().equals(vendor.toLowerCase())||vendor.equals("")) && (product.getBasePrice() >= minPrice || minPrice == 0) &&  (product.getBasePrice() <= maxPrice || maxPrice == 0) && (product.getProductDescription().toLowerCase().contains(keyWords.toLowerCase()) || product.getProductFeatures().toLowerCase().contains(keyWords.toLowerCase()) || keyWords.equals("")) && (product.getProductCategory().toLowerCase().equals(category.toLowerCase()) || category.equals(""))){
                productArray.add(product);
            }
        }
        return productArray;
    }
    
    public ArrayList<ProductMaster> searchProduct(String productName, String modelNo){
        ArrayList<ProductMaster> productArray = new ArrayList<ProductMaster>();
        for (ProductMaster product: productMasterCatalog){
            if((product.getProductName().toLowerCase().equals(productName.toLowerCase())||productName.equals("") ) && (product.getModelNo().toLowerCase().equals(modelNo.toLowerCase())||modelNo.equals("")) ){
                productArray.add(product);
            }
        }
        return productArray;
    }
    public double maxPrice(ArrayList<ProductMaster> resultArray){
        double max = 0;
        for (ProductMaster product: resultArray){
            if(product.getBasePrice()>max){
                max = product.getBasePrice();
            }
        }
        return max;
    }
    
    public double minPrice(ArrayList<ProductMaster> resultArray){
        double min = 999999;
        for (ProductMaster product: resultArray){
            if(product.getBasePrice()<min){
                min = product.getBasePrice();
            }
        }
        return min;
    }
    
     public double maxPrice(ArrayList<ProductMaster> resultArray, String catalog){
        double max = 0;
        for (ProductMaster product: resultArray){
            if(product.getProductCategory().equals(catalog)){
                if(product.getBasePrice()>max){
                    max = product.getBasePrice();
                }
            }
        }
        return max;
    }
    
    public double minPrice(ArrayList<ProductMaster> resultArray, String catalog){
        double min = 999999;
        for (ProductMaster product: resultArray){
            if(product.getProductCategory().equals(catalog)){
                if(product.getBasePrice()<min){
                    min = product.getBasePrice();
                }
            }
        }
        return min;
    }
    
    
    
    

    
    
    
}
