package com.co.kerbero.producto.models.service;

import java.util.List;

import com.co.kerbero.producto.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void deleteById(Long id);
}
