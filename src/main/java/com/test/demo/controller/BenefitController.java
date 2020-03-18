package com.test.demo.controller;

import com.test.demo.dto.BenefitDTO;
import com.test.demo.service.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/api/benefits")
public class BenefitController {

    @Autowired
    private BenefitService benefitService;

    // admin
    @GetMapping("")
    public List<BenefitDTO> getAllBenefits() {
        return benefitService.getAllBenefits();
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/getBenefitsBySubscription")
    public List<BenefitDTO> getBenefitsBySubscription(Principal principal, @PathVariable(value = "id") int subId) {
        return benefitService.getBenefitsBySubscription(principal, subId);
    }
}