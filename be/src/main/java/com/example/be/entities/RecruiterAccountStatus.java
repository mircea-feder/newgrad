package com.example.be.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.example.be.entities.base.IBaseEntity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamoDBTable(tableName = "recruiterAccountStatus")
public class RecruiterAccountStatus implements IBaseEntity {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;
    @DynamoDBAttribute
    private @NonNull String username;
    @DynamoDBAttribute
    private @NonNull String status;              // UNCONFIRMED, CONFIRMED, SUSPENDED, BANNED

    public RecruiterAccountStatus(@NonNull String username,@NonNull String status) {
        this.username = username;
        this.status = status;
    }
}
