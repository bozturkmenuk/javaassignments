package com.fractal.api.v1.domain;

import lombok.Data;

@Data
public class PatchOnlyTransactionCategoryDTO {
    Long    transactionId;
	Integer newcategoryId;
}
