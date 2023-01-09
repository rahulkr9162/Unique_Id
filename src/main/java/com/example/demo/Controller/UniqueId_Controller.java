package com.example.demo.Controller;

import com.example.demo.Model.Unique_Id;
import com.example.demo.Service.UniqueId_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UniqueId_Controller {

    @Autowired
    UniqueId_Service uniqueId_service;

@PostMapping("/addIdtoName")
    public ResponseEntity<String> Id_to_Name(@RequestBody()Unique_Id unique_id){
    String response = uniqueId_service.add_id_to_Name(unique_id);
    return new ResponseEntity<>("Name added Successfully to DB", HttpStatus.ACCEPTED);
}

@GetMapping("/getnameById")
    public ResponseEntity<String> get_Name_By_Id(@RequestParam("uniqueid") Integer id){
    String response = uniqueId_service.getnamebyid(id);
    return new ResponseEntity<>("Valid name", HttpStatus.OK);
}

}
