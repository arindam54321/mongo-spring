package com.mongo.db.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    Integer id;
    String email;
    String password;

    @Override
    public String toString() {
        return "AccountModel{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Account fromDto() {
        return Account.builder()
                .password(this.password)
                .email(this.email)
                .id(this.id)
                .build();
    }
}
