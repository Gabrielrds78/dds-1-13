package com.example.algamoneyapi.resource;

import com.example.algamoneyapi.model.Categoria;
import com.example.algamoneyapi.repository.CategoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoraRepository categoraRepository;

    @GetMapping
    public List<Categoria> listar(){
        return categoraRepository.findAll();
    }
        @PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria, HttpServletResponse response){
            Categoria categoriaSalva = categoraRepository.save(categoria);

            URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
                    .buildAndExpand(categoriaSalva.getCodigo()).toUri();
            response.setHeader("Location", uri.toASCIIString());

            return ResponseEntity.created(uri).body(categoriaSalva);
        }
    @GetMapping("/{codigo}")
    public Categoria buscarPeloCodigo(@PathVariable Long codigo){
        return categoraRepository.findById(codigo).orElse(null);
    }
}
