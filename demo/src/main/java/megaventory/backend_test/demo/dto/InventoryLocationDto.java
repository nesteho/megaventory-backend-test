package megaventory.backend_test.demo.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class InventoryLocationDto {

    @NonNull private String abbreviation;
    @NonNull private String name;
    @NonNull private String address;
}
