package com.maria.baracho.citiesapi.repositories;

import com.maria.baracho.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
