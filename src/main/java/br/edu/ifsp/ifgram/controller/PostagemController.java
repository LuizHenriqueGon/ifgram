package br.edu.ifsp.ifgram.controller;

import br.edu.ifsp.ifgram.model.Postagem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    // Simulando um banco de dados em memória
    private List<Postagem> postagens = new ArrayList<>();
    private Long proximoId = 1L;

    // GET /postagens - Retorna todas as postagens (200 OK)
    @GetMapping
    public ResponseEntity<List<Postagem>> listar() {
        return ResponseEntity.ok(postagens);
    }

    // POST /postagens - Cria uma nova postagem (201 Created)
    @PostMapping
    public ResponseEntity<Postagem> adicionar(@RequestBody Postagem novaPostagem) {
        novaPostagem.setId(proximoId++);
        novaPostagem.setDataCriacao(LocalDateTime.now());
        postagens.add(novaPostagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaPostagem);
    }

    // GET /postagens/{id} - Busca uma postagem específica (200 OK ou 404 Not Found)
    @GetMapping("/{id}")
    public ResponseEntity<Postagem> detalhar(@PathVariable Long id) {
        Optional<Postagem> postagem = postagens.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        if (postagem.isPresent()) {
            return ResponseEntity.ok(postagem.get());
        }
        return ResponseEntity.notFound().build();
    }

    // PUT /postagens/{id} - Atualiza uma postagem (200 OK ou 404 Not Found)
    @PutMapping("/{id}")
    public ResponseEntity<Postagem> atualizar(@PathVariable Long id, @RequestBody Postagem postagemAtualizada) {
        for (Postagem p : postagens) {
            if (p.getId().equals(id)) {
                p.setTitulo(postagemAtualizada.getTitulo());
                p.setConteudo(postagemAtualizada.getConteudo());
                // Mantemos o id e a data de criação originais intactos
                return ResponseEntity.ok(p);
            }
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE /postagens/{id} - Deleta uma postagem (200 OK ou 404 Not Found)
    @DeleteMapping("/{id}")
    public ResponseEntity<Postagem> deletar(@PathVariable Long id) {
        for (int i = 0; i < postagens.size(); i++) {
            if (postagens.get(i).getId().equals(id)) {
                Postagem removida = postagens.remove(i);
                return ResponseEntity.ok(removida);
            }
        }
        return ResponseEntity.notFound().build();
    }
}