package controller;

import model.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.CarroRepository;

import java.util.List;

@RestController
@RequestMapping (value="/apiCarro")
public class CarroController {
    @Autowired
    CarroRepository carRepo;

    @GetMapping("/buscarCarro")
    public List<Carro> buscarCarros() {
        return carRepo.findAll();
    }

    @PostMapping("/inserirCarro")
    public void inserirCarros(@RequestBody Carro carro){
        carRepo.save(carro);
    }
}
