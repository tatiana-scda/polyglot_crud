package com.zireael.crud.repository;

import com.zireael.crud.entity.CrudEntity;
import com.zireael.crud.vo.CrudRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepositoryInterface extends CrudRepository<CrudEntity, String> {

    CrudEntity getById (String id);

    void save (CrudRequest request);
}
