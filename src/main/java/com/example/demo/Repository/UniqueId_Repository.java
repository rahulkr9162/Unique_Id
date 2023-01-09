package com.example.demo.Repository;
import com.example.demo.Model.Unique_Id;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class UniqueId_Repository {
    HashMap<Integer,String> UniqueIdDB;

    public UniqueId_Repository(){
        this.UniqueIdDB = new HashMap<>();
    }

    public String add_id_to_Name(Unique_Id unique_id){
        Integer id = unique_id.getId();
        String name = unique_id.getName();
        UniqueIdDB.put(id, name);
        return "Name added successfully";
    }

    public String getnamebyid(Integer id){
        return UniqueIdDB.get(id);
    }
}
