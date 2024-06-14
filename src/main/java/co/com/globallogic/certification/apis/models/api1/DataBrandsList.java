package co.com.globallogic.certification.apis.models.api1;

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

public class DataBrandsList {

    @SerializedName("brands")
    @Expose
    private String brands;

}
