package com.controller.service.repository.autowired;

import org.springframework.stereotype.Repository;
 
@Repository("countryDAO")
public class CountryDAO {
 
 public Country createNewCountry() {
  // You should get it from database
  Country country = new Country("�ndia", 8000);
  return country;
 }
 
}