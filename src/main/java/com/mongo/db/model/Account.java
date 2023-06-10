package com.mongo.db.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "accounts")
public class Account {
    @Id
    Integer id;
    @Field
    String email;
    @Field
    String password;

    @Override
    public String toString() {
        return "AccountModel{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public AccountDTO fromDto() {
        return AccountDTO.builder()
                .password(this.password)
                .email(this.email)
                .id(this.id)
                .build();
    }
}
