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
@DynamoDBTable(tableName = "savedJob")
public class SavedJob implements IBaseEntity {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;
    @DynamoDBAttribute
    private @NonNull String jobId;
    @DynamoDBAttribute
    private String username;
    @DynamoDBAttribute
    private String queryIndex;
}
