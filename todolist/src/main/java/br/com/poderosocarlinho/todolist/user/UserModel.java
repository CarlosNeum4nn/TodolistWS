package br.com.poderosocarlinho.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name = "tb_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

@Column(unique = true)
  public  String username;
  public  String name;
  public  String password;




@CreationTimestamp
private LocalDateTime createdAt;




public UUID getId() {
  return id;
}




public void setId(UUID id) {
  this.id = id;
}




public String getUsername() {
  return username;
}




public void setUsername(String username) {
  this.username = username;
}




public String getName() {
  return name;
}




public void setName(String name) {
  this.name = name;
}




public String getPassword() {
  return password;
}




public void setPassword(String password) {
  this.password = password;
}




public LocalDateTime getCreatedAt() {
  return createdAt;
}




public void setCreatedAt(LocalDateTime createdAt) {
  this.createdAt = createdAt;
}

 /* Setter : Inserir "Setar" valor */
 /* Getter : Consultar "Pegar" valor/dado */
/* Lombok tem @Data, @Setter e @Getter para não precisar escrever o comando toda hora */
}





