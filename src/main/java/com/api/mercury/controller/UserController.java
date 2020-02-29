package com.api.mercury.controller;

import com.api.mercury.dto.Response;
import com.api.mercury.dto.UserDTO;
import com.api.mercury.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<Response<UserDTO>> save(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(new Response<>(HttpStatus.OK.value(), "user saved successfully", userService.save(userDTO)), HttpStatus.OK);
    }

    @PostMapping("{id}")
    public ResponseEntity<Response<UserDTO>> getUserById(@PathVariable UUID id) {
        return new ResponseEntity<>(new Response<>(HttpStatus.OK.value(), "user fetched successfully", userService.get(id)), HttpStatus.OK);
    }
}
