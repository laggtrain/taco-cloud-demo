package takos.data;

import org.springframework.data.repository.CrudRepository;
import takos.TacoOrder;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
