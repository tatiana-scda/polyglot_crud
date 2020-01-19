package com.zireael.crud.service;

import com.zireael.crud.entity.CrudEntity;
import com.zireael.crud.vo.CrudRequest;
import com.zireael.crud.vo.CrudResponse;
import com.zireael.crud.repository.CrudRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class CrudService {

    CrudRepositoryInterface crudRepositoryInterface;

    public CrudService(CrudRepositoryInterface crudRepositoryInterface) {
        this.crudRepositoryInterface = crudRepositoryInterface;
    }

    public CrudEntity getById(String id) {
        return crudRepositoryInterface.getById(id);
    }

    public void post(CrudRequest request) {
        crudRepositoryInterface.save(request);
    }
}
