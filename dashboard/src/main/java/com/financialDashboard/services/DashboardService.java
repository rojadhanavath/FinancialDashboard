package com.financialDashboard.services;


import com.financialDashboard.models.Cats;
import com.financialDashboard.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DashboardService {

    public String getheartbeat(){

        Date obj = new Date();
        String datenow = String.valueOf(obj.getTime());
        return datenow;

    }

    @Autowired
    CatRepository catRepository;


    public void setCat(){
        Cats cats = new Cats();
        cats.setColor("red");
        catRepository.save(cats);
    }

    public Cats getCat(){

        List<Cats> cats = catRepository.findAll();
        Optional<Cats> one  = cats.stream().findFirst();

        if(one.isPresent())
        {
            return one.get();
        }
   return null;
    }

}
