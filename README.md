const projectsData = Project[] = [
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
}`

Technologies:[Java,React,Spring boot,SQL]
}
];


Spring Boot starter project for hands-on REST API practice

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
