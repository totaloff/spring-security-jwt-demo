package com.example.spring.security.jwt.demo.models;

import java.time.Instant;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "REFRESH_TOKEN")
@Getter
@Setter
public class RefreshToken {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @OneToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  @Column(nullable = false, unique = true)
  private String token;

  @Column(nullable = false)
  private Instant expiryDate;
}