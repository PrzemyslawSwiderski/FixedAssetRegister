package pswiderski.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "SrodkiTrwaleCollection")
public class Asset {

  @Id
  private String _id;

  private String name;

  private Date purchaseDate;

  private BigDecimal price;

}
