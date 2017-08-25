package org.stevan.test.resources;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import model.ElementaryProduct;
import model.InsuredObject;
import model.Product;
import model.SalesProduct;
import service.ElementaryProductService;
import service.InsuredObjectService;
import service.ProductService;
import service.SalesProductService;

@Path("/elementaryProducts")
public class ElementaryProductResource {

	//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	//private SalesProductDAO salesProductDAO = (SalesProductDAO) ctx.getBean("salesProductDAO");
	
	@Autowired
	@Qualifier("salesProductService")
	private SalesProductService salesProductService;

	@Autowired
	@Qualifier("insuredObjectService")
	private InsuredObjectService insuredObjectService;
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
	@Autowired
	@Qualifier("elementaryProductService")
	private ElementaryProductService elementaryProductService;
	
	@GET
	public void getTest() {
		try {
			SalesProduct salesProduct = new SalesProduct();
			salesProduct.setSalesProductId(1);
			salesProduct.setCurrency("test");
			salesProduct.setContractStart(new Date());
			salesProduct.setContractEnd(new Date());
			
			salesProductService.insert(salesProduct);
			
			System.out.println("Succsessfull insert salesProduct");
			
			InsuredObject insuredObject = new InsuredObject();
		//	insuredObject.setInsuredObjectId(1);
			insuredObject.setEngineCapacity(1200);
			insuredObject.setMileage(20000);
			insuredObject.setName("Audi");
			insuredObject.setOwnersName("Nemanja");
			
			insuredObjectService.insert(insuredObject);
			
			System.out.println("Succsessfull insert insuredObject");
			
			Product product = new Product();
			product.setProductID(1);
			product.setGarage(true);
			product.setRegion("serbia");
			product.setDateOfBirthYoungest(new Date());
			product.setConstructionYear(2017);
			product.setObjectValue(1);
			product.setType("test");
			product.setProductType("test");
			product.setInsuredObject(insuredObject);
			product.setSalesProduct(salesProduct);
			
			productService.insert(product);
			
			System.out.println("Succsessfull insert product");
			
			ElementaryProduct elementaryProduct = new ElementaryProduct();
			elementaryProduct.setBonusMalus(1);
			elementaryProduct.setComprehensive(1);
			elementaryProduct.setDeductible(1);
			elementaryProduct.setElementaryProductId(1);
			elementaryProduct.setLegacyPremium(1);
			elementaryProduct.setPartial(1);
			elementaryProduct.setPremium(1.5);
			elementaryProduct.setProduct(product);
			
			elementaryProductService.insert(elementaryProduct);
			
			System.out.println("Succsessfull insert elementary product");
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/test")
	public Product test(){
		Product product = new Product();
		product.setProductID(1);
		product.setGarage(true);
		product.setRegion("serbia");
		product.setDateOfBirthYoungest(new Date());
		product.setConstructionYear(2017);
		product.setObjectValue(1);
		product.setType("test");
		product.setProductType("test");
		product.setInsuredObject(null);
		product.setSalesProduct(null);
		return product;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void processElementaryProducts(List<ElementaryProduct> elementaryProducts) {
		try {
			//Content-Type  ---  application/json
			for(ElementaryProduct elementaryProduct:elementaryProducts){
				SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
				String date = sdf.format(elementaryProduct.getProduct().getDateOfBirthYoungest());
				System.out.println(date);
				System.out.println(sdf.format(elementaryProduct.getProduct().getSalesProduct().getContractStart()));
				System.out.println(sdf.format(elementaryProduct.getProduct().getSalesProduct().getContractEnd()));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
