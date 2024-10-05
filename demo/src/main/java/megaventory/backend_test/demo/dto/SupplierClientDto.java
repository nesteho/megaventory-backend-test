package megaventory.backend_test.demo.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class SupplierClientDto {

    @NonNull
    private String name;
    @NonNull private String email;
    @NonNull private String shippingAddress;
    @NonNull private String phone;
    @NonNull private ContactType contactType;

    public  enum ContactType{
        SUPPLIER, CLIENT;
    }
}
