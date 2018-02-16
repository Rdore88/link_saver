package links.links;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "links", path = "links")
public interface LinkRepository extends PagingAndSortingRepository<Link, Long> {

    List<Link> findByTitle(@Param("title") String title);

}
