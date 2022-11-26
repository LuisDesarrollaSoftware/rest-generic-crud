package com.luisdesarrollasoftware.restgenericcrud.base.dominio.repositories;


import com.luisdesarrollasoftware.restgenericcrud.base.dominio.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;


@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E,ID> {
}
