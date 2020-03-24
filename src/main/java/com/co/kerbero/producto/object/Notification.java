package com.co.kerbero.producto.object;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Notification {

	private HttpStatus status;
	private String message;
	private List<String> errors;
	private String errorCode;

}
