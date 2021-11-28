package com.misiontic.ecoturism.controllers;

import com.misiontic.ecoturism.exceptions.PlanNotFoundException;
import com.misiontic.ecoturism.models.Plan;
import com.misiontic.ecoturism.repositories.PlanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PlanController {
    private final PlanRepository planRepository;

    public PlanController(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @GetMapping("/plan/{id}")
    public Plan getPlan(@PathVariable String id){
return this.planRepository.findById(id)
        .orElseThrow(() -> new PlanNotFoundException("El plan no existe"));
    }

    @PostMapping("/plan")
    public Plan newPlan(@RequestBody Plan plan){
return this.planRepository.save(plan);
    }

    @DeleteMapping("/plan/{id}")
    public void deletePlan(@PathVariable String id){
        this.planRepository.deleteById(id);
    }

    @PutMapping("/plan/{id}")
    public Plan updatePlan(@PathVariable String id,@RequestBody Plan newPlan){
    Plan oldPlan = this.planRepository.findById(id).orElseThrow(() -> new PlanNotFoundException("El plan no existe"));
    oldPlan.setValor(newPlan.getValor());
    oldPlan.setfInicio(newPlan.getfInicio());
    oldPlan.setfFin(newPlan.getfFin());
    oldPlan.setCompletado(newPlan.getCompletado());
    oldPlan.setServicios(newPlan.getServicios());

    return this.planRepository.save(oldPlan);

    }
}
