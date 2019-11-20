package com.fractal.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fractal.api.v1.domain.CategoryListDTO;
import com.fractal.api.v1.domain.TransactionListDTO;
import com.fractal.model.Transaction;
import com.fractal.service.TransactionService;

import javassist.expr.NewArray;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-17T22:51:11.563Z")

@Controller
public class GetcategorizedtransactionsApiController implements GetcategorizedtransactionsApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private final TransactionService transactionService;

    @org.springframework.beans.factory.annotation.Autowired
    public GetcategorizedtransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request,TransactionService transactionService) {
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
	public ResponseEntity<TransactionListDTO> getCategorizedTransactionsById(Integer categoryId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<TransactionListDTO>(new TransactionListDTO(transactionService.getTransactionsByCategoryId(categoryId)) ,HttpStatus.OK);
                } catch (Exception e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    e.printStackTrace();
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default GetcategorizedtransactionsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

	

}
