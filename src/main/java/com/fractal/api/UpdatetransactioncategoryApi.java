/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.fractal.api;

import com.fractal.api.v1.domain.PatchOnlyTransactionCategoryDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-20T22:10:17.054Z")

@Api(value = "updatetransactioncategory", description = "the updatetransactioncategory API")
public interface UpdatetransactioncategoryApi {

    Logger log = LoggerFactory.getLogger(UpdatetransactioncategoryApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "update a given transaction's category", nickname = "updateTransactionCategory", notes = "update a given transaction's category.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Transaction updated"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "given category not exists!") })
    @RequestMapping(value = "/updatetransactioncategory",
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    public ResponseEntity<Void> updateTransactionCategory(@ApiParam(value = ""  )  @Valid @RequestBody PatchOnlyTransactionCategoryDTO updatePatch) ;

}
