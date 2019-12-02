package com.fractal.api.v1.mapper;

import com.fractal.api.v1.domain.TransactionDTO;
import com.fractal.model.Transaction;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-01T23:12:27+0000",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDTO transactionToTransactionDTO(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionDTO transactionDTO = new TransactionDTO();

        transactionDTO.setId( transaction.getId() );
        transactionDTO.setCategory( transaction.getCategory() );
        transactionDTO.setDate( transaction.getDate() );
        transactionDTO.setQuantity( transaction.getQuantity() );
        transactionDTO.setCurrency( transaction.getCurrency() );

        return transactionDTO;
    }
}
