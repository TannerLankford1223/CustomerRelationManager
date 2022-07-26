package com.example.customerrelationmanager.application;

import com.example.customerrelationmanager.domain.dto.CustomerDTO;
import com.example.customerrelationmanager.domain.ports.api.CustomerServicePort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerServicePort customerService;

    public CustomerController(CustomerServicePort customerService) {
        this.customerService = customerService;
    }

    // Redirects to customer list page
    @RequestMapping("/")
    public String showPage() {
        return "redirect:/customer/list";
    }

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<CustomerDTO> customers = customerService.getCustomers();

        model.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        CustomerDTO customer = new CustomerDTO();

        model.addAttribute("customer", customer);

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") @Valid CustomerDTO customer, BindingResult result) {
        if (result.hasErrors()) {
            return "customer-form";
        }

        customerService.saveCustomer(customer);
        log.info("customer saved successfully");
        return "redirect:/customer/list";
    }

    @GetMapping("/details")
    public String showFormForDetails(@RequestParam("customerId") int id, Model model) {
        CustomerDTO customer = customerService.getCustomer(id);

        model.addAttribute("customer", customer);

        return "customer-details";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
        CustomerDTO customer = customerService.getCustomer(id);

        model.addAttribute("customer", customer);
        log.info("customer updated successfully");
        return "customer-form";
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int id, Model model) {
        customerService.deleteCustomer(id);
        log.error("customer deleted successfully");
        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomers(@RequestParam("searchName") String searchName, Model model) {
        List<CustomerDTO> customers = customerService.searchCustomers(searchName);

        model.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/showFormForNotes")
    public String showFormForNotes(@RequestParam("customerId") int id, Model model) {
        CustomerDTO customer = customerService.getCustomer(id);

        model.addAttribute("customer", customer);
        log.info("notes updated successfully");
        return "note-form";
    }

}
