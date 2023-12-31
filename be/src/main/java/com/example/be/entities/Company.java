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
@DynamoDBTable(tableName = "company")
public class Company implements IBaseEntity {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private @NonNull String id;
    @DynamoDBAttribute
    private @NonNull String name;
    @DynamoDBAttribute
    private @NonNull String recruiterEmailDomain;

    public Company(@NonNull String name, @NonNull String recruiterEmailDomain) {
        this.name = name;
        this.recruiterEmailDomain = recruiterEmailDomain;
    }
}
