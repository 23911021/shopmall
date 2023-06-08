package shopmall.domain;

import java.util.*;
import lombok.*;
import shopmall.domain.*;
import shopmall.infra.AbstractEvent;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;

    public StockDecreased(Stock aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
