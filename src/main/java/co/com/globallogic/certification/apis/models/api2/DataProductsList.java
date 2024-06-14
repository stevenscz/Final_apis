package co.com.globallogic.certification.apis.models.api2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class DataProductsList {

    @SerializedName("products")
    @Expose
    private String products;

}
