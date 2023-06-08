package shopmall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopmall.domain.*;

@RepositoryRestResource(collectionResourceRel = "stocks", path = "stocks")
public interface StockRepository
    extends PagingAndSortingRepository<Stock, Long> {}
