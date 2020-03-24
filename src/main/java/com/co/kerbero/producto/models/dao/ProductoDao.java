package com.co.kerbero.producto.models.dao;

import com.co.kerbero.producto.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
