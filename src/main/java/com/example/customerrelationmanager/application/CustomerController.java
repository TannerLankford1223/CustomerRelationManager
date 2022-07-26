package com.example.customerrelationmanager.application;

import com.example.customerrelationmanager.domain.ports.api.CustomerServicePort;
import com.example.customerrelationmanager.infrastructure.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerServicePort customerService;

    public CustomerController(CustomerServicePort customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public String listCustomers(Model model) {
        return null;
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        return null;
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        return null;
    }

    @GetMapping("/details")
    public String showFormForDetails(Model model) {
        return null;
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
        return null;
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int id, Model model) {
        return null;
    }

    @GetMapping("/search")
    public String searchCustomers(@RequestParam("searchName") String searchName, Model model) {
        return null;
    }

}
