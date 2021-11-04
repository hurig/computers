package hu.computersSimpleAPI.controller;

import hu.computersSimpleAPI.domain.Computer;
import hu.computersSimpleAPI.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ComputerService service;

    @GetMapping("/")
    public String home(){
        return "Működik";
    }

    @GetMapping("/computers")
    public List<Computer> getComputers(){
        return service.getComputers();
    }

    @GetMapping("/computers/{id}")
    public Computer getComputer(@PathVariable int id){
        return service.getComputerBySerial(id);
    }

    @GetMapping("/computers/man/{manufacture}")
    public List<Computer> getComputerByManufacture(@PathVariable String manufacture){
        System.out.println("Man: "+manufacture);
        return service.getComputersByManufacture(manufacture);
    }


}
