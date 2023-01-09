package com.example.demo.Service;
import com.example.demo.Model.Unique_Id;
import com.example.demo.Repository.UniqueId_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniqueId_Service {


    @Autowired
    UniqueId_Repository uniqueId_repository;


    public String add_id_to_Name(Unique_Id unique_id){
        return uniqueId_repository.add_id_to_Name(unique_id);
    }

    public String getnamebyid(Integer id){
        return uniqueId_repository.getnamebyid(id);
    }
}
