package com.co.kerbero.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.co.kerbero.producto.models.entity.Producto;
import com.co.kerbero.producto.models.service.IProductoService;

@RestController
@CrossOrigin("*")
public class ProductoController {

	@Autowired
	private IProductoService iProductoService;
	
	@GetMapping("/listar")
	public List<Producto>listar(){
		return iProductoService.findAll();
	}
	
	@GetMapping("/detalle/{id}")
	public Producto detalle(@PathVariable Long id){
//		try {
//			Thread.sleep(2000);
//		}catch (Exception e) {
//		}
		return iProductoService.findById(id);
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto crear(@RequestBody Producto producto) {
		return iProductoService.save(producto);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto editar(@RequestBody Producto producto, @PathVariable Long id){
		Producto productoDb = iProductoService.findById(id);
		productoDb.setNombre(producto.getNombre());
		productoDb.setPrecio(producto.getPrecio());
		return iProductoService.save(productoDb);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id){
		iProductoService.deleteById(id);
	}
	
}
