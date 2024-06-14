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

public class Brands {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("brand")
    @Expose
    private String brand;


}
