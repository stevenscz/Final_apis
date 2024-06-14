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

public class Category {

    @SerializedName("usertype")
    @Expose
    private String usertype;

    @SerializedName("category")
    @Expose
    private String category;

}
