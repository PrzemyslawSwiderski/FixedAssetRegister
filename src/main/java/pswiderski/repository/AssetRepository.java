package pswiderski.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pswiderski.model.Asset;

@RepositoryRestResource
public interface AssetRepository extends MongoRepository<Asset, String> {

  List<Asset> findByName(@Param("name") String name);

}
