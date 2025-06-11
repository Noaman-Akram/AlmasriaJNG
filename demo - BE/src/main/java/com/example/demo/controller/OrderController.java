




@RestController
@RequestMapping("/order")
public class OrderController{

    @Autowired
    private OrderRepository orderRepo;   

    @PostMapping
    public addOrder(@RequestBody Order x){
        return orderRepo.save(x);
    }

    @GetMapping
    public List<Order> getAllOrder(){
        return order
    }

}


