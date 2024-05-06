package com.ariesbookshop.apirest.Favorites.FavoritesController;

import java.util.List;

/* import org.springframework.http.ResponseEntity; */
import org.springframework.web.bind.annotation.*;

import com.ariesbookshop.apirest.Favorites.Favorites.Favorite;
import com.ariesbookshop.apirest.Favorites.FavoritesService.FavoriteService;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = "http://localhost:4200")
public class FavoriteController {

    private final FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    //http://localhost:8080/api/favorites
    @PostMapping
    public Favorite save (@RequestBody Favorite favorites){
        return favoriteService.save(favorites);
    }
    //http://localhost:8080/api/favorites
    @GetMapping
    public List<Favorite> findAll(){
        return favoriteService.findAll();
    }

    @GetMapping ("/{id}")
    public List<Favorite> findByIdUser(@PathVariable Integer id){
        return favoriteService.findByIdUser(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){
        favoriteService.deleteById(id);
    }
}