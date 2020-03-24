package com.co.kerbero.producto.mapper;

@SuppressWarnings("hiding")
public interface IMappers <Object, DTO> {

	DTO objectToDto(Object object);
}
