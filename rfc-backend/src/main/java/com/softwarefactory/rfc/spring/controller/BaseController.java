package com.softwarefactory.rfc.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softwarefactory.rfc.model.Entity;
import com.softwarefactory.rfc.service.BaseService;

@RestController
public class BaseController {

   @Autowired
   private BaseService service;

   @PostMapping("/test")
   public ResponseEntity<?> save(@RequestBody Entity entity) {
      int id = service.saveEntity(entity);
      return ResponseEntity.ok().body("New Entity saved with id:" + id);
   }

   @GetMapping("/test/{id}")
   public ResponseEntity<Entity> get(@PathVariable("id") int id) {
      return ResponseEntity.ok().body(service.getEntity(id));
   }
}