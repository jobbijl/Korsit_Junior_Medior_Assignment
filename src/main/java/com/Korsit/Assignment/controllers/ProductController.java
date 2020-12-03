package com.Korsit.Assignment.controllers;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * This is your first spring boot controller for your products.
 * Please create all nescesary endpoints and make them work as described in the assessment
 */
/**
 *
 * @author j.bijl
 */
@RequestMapping("/products")
@RestController
public class ProductController {

    @GetMapping("/")
    String get() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Please implement and create the calls according to the assignment.");
    }
}
