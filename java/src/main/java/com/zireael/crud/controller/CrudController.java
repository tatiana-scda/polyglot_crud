package com.zireael.crud.controller;

import com.zireael.crud.entity.CrudEntity;
import com.zireael.crud.vo.CrudRequest;
import com.zireael.crud.vo.CrudResponse;
import com.zireael.crud.service.CrudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud")
public class CrudController {

    private CrudService crudService;

    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    @GetMapping("/{id}")
    public CrudEntity get(@PathVariable("id") String id) {
        return crudService.getById(id);
    }

    @PostMapping
    public void post(@RequestBody CrudRequest request) {
        crudService.post(request);
    }
}
