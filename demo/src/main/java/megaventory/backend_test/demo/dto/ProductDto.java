package megaventory.backend_test.demo.dto;

import lombok.*;


@Data
public class ProductDto {


    @Getter
    @NonNull private  final String SKU;
    @NonNull private String description;
    @NonNull private double salesPrice;
    @NonNull private double purchasePrice;

    // @AllArgsConstructor not working with the final attribute :(
    public ProductDto(String SKU, String description, double salesPrice, double purchasePrice) {
        this.SKU = SKU;
        this.description = description;
        this.salesPrice = salesPrice;
        this.purchasePrice = purchasePrice;
    }


}
