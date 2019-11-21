package com.fractal.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fractal.api.v1.domain.PatchOnlyTransactionCategoryDTO;
import com.fractal.service.TransactionService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-20T22:10:17.054Z")

@Controller
public class UpdatetransactioncategoryApiController implements UpdatetransactioncategoryApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private final TransactionService transactionService;

    @org.springframework.beans.factory.annotation.Autowired
    public UpdatetransactioncategoryApiController(ObjectMapper objectMapper, HttpServletRequest request,TransactionService transactionService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.transactionService = transactionService;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

	@Override
	public ResponseEntity<Void> updateTransactionCategory(@Valid PatchOnlyTransactionCategoryDTO updatePatch) {

        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        	 try {
				transactionService.UpdateTransactionCategory(updatePatch.getTransactionId(), updatePatch.getNewcategoryId());
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
        
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UpdatetransactioncategoryApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
	

}
