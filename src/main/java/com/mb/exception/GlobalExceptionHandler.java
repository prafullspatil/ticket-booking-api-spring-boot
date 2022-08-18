package com.mb.exception;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import com.mb.response.ErrorResponse;
import com.mb.response.SuccResponse;
import com.mb.response.ValidationErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler
{

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleResourceAlreadyExistsException(Exception ex)
	{
		return new ErrorResponse(new Date(), "Show Already Exists", ex.getMessage(), HttpStatus.NOT_FOUND.value(), ex.getMessage());
	}

	@ExceptionHandler(value = CustomException.class)
	public ErrorResponse customizedException(CustomException ex)
	{
		return new ErrorResponse(new Date(), ex.getMessage(), ex.getLocalizedMessage(), HttpStatus.CONFLICT.value(), "Bad Request");
	}

	@ExceptionHandler(value = NullPointerException.class)
	public ErrorResponse nullPointerException(NullPointerException ex)
	{
		return new ErrorResponse(new Date(), ex.getMessage(), ex.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "Something Went wrong");
	}

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)
	{
		List<ValidationErrorResponse> errorsValidation = ex.getBindingResult().getFieldErrors().stream()
				.map(err -> new ValidationErrorResponse(err.getField(), err.getDefaultMessage())).collect(Collectors.toList());
		SuccResponse model = new SuccResponse();

		return model.validationErrorsResponse("enter valid data ", errorsValidation);
	}

}
