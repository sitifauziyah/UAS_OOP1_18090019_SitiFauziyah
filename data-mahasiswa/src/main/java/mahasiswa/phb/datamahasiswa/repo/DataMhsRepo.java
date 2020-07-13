package mahasiswa.phb.datamahasiswa.repo;

import mahasiswa.phb.datamahasiswa.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}
