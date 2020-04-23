package com.capgemini.angularassignment.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {

	private boolean error;
	private String message;

	private ProductPrimary productInfo;
	private List<ProductPrimary> productsInfo;
}
