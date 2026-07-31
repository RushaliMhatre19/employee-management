package com.example.employeemanagement.controller;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditEmployeeForm(@PathVariable Long id, Model model) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Employee ID: " + id));

        model.addAttribute("employee", employee);

        return "edit-employee";
    }

    @PostMapping("/update")
    public String updateEmployee(Employee employee) {

        employeeRepository.save(employee);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        return "redirect:/";
    }
    
    
    @GetMapping("/search")
    public String searchEmployee(@RequestParam String keyword, Model model) {

        model.addAttribute(
            "employees",
            employeeRepository.findByNameContainingIgnoreCase(keyword)
        );

        return "index";
    }
}