package br.com.poderosocarlinho.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

/*
* Modificadores de classe *
Public 
Private 
Protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
   
    @Autowired
   private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
    
        
        var user = this.userRepository.findByUsername(userModel.getUsername());

       

        if(user != null){
System.out.println("Usuário existente");
return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario ja existe");


        
        
    } 


var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

userModel.setPassword(passwordHashred);

 var userCreated = this.userRepository.save(userModel);
return ResponseEntity.status(HttpStatus.OK).body(userCreated);

}}
 /*
     * String (Texto)
     * Integer (int)
     * Double 
     * Float
     * Char
     * Date 
     * Void (Quando não queremos ter retorno do método)
     */
