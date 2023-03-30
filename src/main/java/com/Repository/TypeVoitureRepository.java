package com.Repository;

import com.entity.TypeVoiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeVoitureRepository  extends JpaRepository<TypeVoiture,Long> {
}
