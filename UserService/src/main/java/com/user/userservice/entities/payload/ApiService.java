package com.user.userservice.entities.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiService {
    private String message;
    private String success;
    private HttpStatus status;
}
