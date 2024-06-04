package com.example.officeManagementApp.Controller;

import com.example.officeManagementApp.Model.Manager;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ManagerController
{
    Map<Integer, Manager> manDb = new HashMap<>();

    @PostMapping("/add-manager")
    public String addManager(@RequestBody Manager manager)
    {
        manDb.put(manager.getManagerId(), manager);
        return "Manager registered successfully!!";
    }

    @GetMapping("/get-manager")
    public Manager getManager(@RequestParam("id") int managerId)
    {
        return manDb.get(managerId);
    }

    @DeleteMapping("/delete-manager/{id}")
    public String deleteManager(@PathVariable("id") int managerId)
    {
        manDb.remove(managerId);
        return "Manager was deleted";
    }


}
