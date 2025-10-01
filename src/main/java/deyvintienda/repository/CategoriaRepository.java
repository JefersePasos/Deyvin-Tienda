package deyvintienda.repository;
 
import deyvintienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
    public List<Categoria> findByActivoTrue();
 
}