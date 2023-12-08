package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;
//this is binding class
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
private Integer idInteger;
private String nameString;
private Double pricDouble;



}
