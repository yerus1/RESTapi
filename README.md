# REST API
Spring Boot starter project for hands-on REST API practice

Technologies: [Java, Spring Boot,Postgresql]

```java
@Service
public class InventoryService {
    @Autowired
    private ProductRepository productRepo;

    @Transactional
    public StockLevel updateStock(String productId, int change) {
        Product product = productRepo.findById(productId).orElseThrow();
        product.adjustStock(change);
        productRepo.save(product);
        return product.getStockLevel();
    }
}
```
----

GET -> http://localhost:8080/products

POST -> http://localhost:8080/products/addproduct
````
{
    "id": 104,
    "productName": "Nothing laptop",
    "price": 13000
}
````

DELETE -> http://localhost:8080/products/100

PUT -> http://localhost:8080/products
````
{
    "id": 104,
    "productName": "Nothing watch",
    "price": 13000
}
````
Projectdetails:[
  {
codeSnippet: 
`@Service
public class InventoryService {
    @Autowired
    private ProductRepository productRepo;

    @Transactional
    public StockLevel updateStock(
        String productId, int change) {
      Product product = productRepo
        .findById(productId)
        .orElseThrow(); 
      product.adjustStock(change);
      productRepo.save(product);
      // Logger.info("Stock updated...");
      return product.getStockLevel();
    }
}`,
Technologies:[Java,React,Spring boot,SQL]
]
