package sn.esmt.OffreEmploie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.esmt.OffreEmploie.entities.CvEntities;

public interface CvRepository extends JpaRepository<CvEntities, Integer> {

    CvEntities findById(int id);
}
