package com.co.kerbero.producto.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.kerbero.producto.exception.BusinessException;
import com.co.kerbero.producto.models.dao.ProductoDao;
import com.co.kerbero.producto.models.entity.Producto;
import com.co.kerbero.producto.models.service.IProductoService;

@Service
public class ProductService implements IProductoService {

	@Autowired
	private ProductoDao productoDao;
	private MessageSource messageSource;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>)productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElseThrow(()-> new BusinessException(messageSource));
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		productoDao.deleteById(id);;
	}

}
