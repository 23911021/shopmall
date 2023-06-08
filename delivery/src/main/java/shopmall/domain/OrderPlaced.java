package shopmall.domain;

import java.util.*;
import lombok.*;
import shopmall.domain.*;
import shopmall.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
