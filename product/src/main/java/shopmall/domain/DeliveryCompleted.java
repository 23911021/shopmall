package shopmall.domain;

import java.util.*;
import lombok.*;
import shopmall.domain.*;
import shopmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
}
