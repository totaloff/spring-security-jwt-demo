package com.example.spring.security.jwt.demo.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenRefreshRequest {
  @NotBlank
  private String refreshToken;
}
