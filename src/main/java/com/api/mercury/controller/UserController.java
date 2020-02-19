package com.api.mercury.controller;

import com.api.mercury.dto.Response;
import com.api.mercury.dto.UserDTO;
import com.api.mercury.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<Response<List<UserDTO>>> getAllUser() {
        return new ResponseEntity<>(new Response<>(HttpStatus.OK.value(), "user fetched successfully", userService.getAllUsers()), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Response<UserDTO>> save(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(new Response<>(HttpStatus.OK.value(), "user saved successfully", userService.save(userDTO)), HttpStatus.OK);
    }
}
