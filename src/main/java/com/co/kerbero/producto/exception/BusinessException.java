package com.co.kerbero.producto.exception;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

@SuppressWarnings("serial")
public class BusinessException extends SolucionRestException {

	private static final String errorCode = "001";

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(MessageSource messageSource) {
		super(messageSource.getMessage(errorCode, null, LocaleContextHolder.getLocale()), errorCode);
	}

}
