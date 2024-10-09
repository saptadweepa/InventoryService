package InventoryService.InventoryDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class InventoryController {

    @GetMapping("/info")
    public String getInfo(){
        return "inventory-service";
    }
}
