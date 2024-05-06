package com.ariesbookshop.apirest.Favorites.FavoritesService;

import org.springframework.stereotype.Service;

import com.ariesbookshop.apirest.Favorites.Favorites.Favorite;
import com.ariesbookshop.apirest.Favorites.FavoritesRepository.FavoriteRepository;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {
    private final FavoriteRepository favoriteRepository;

    public FavoriteServiceImpl(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    @Override
    public Favorite save(Favorite favorites) {
        return favoriteRepository.save(favorites);
    }

    @Override
    public List<Favorite> findByIdUser(Integer idUser) {
        return favoriteRepository.findByIdUser(idUser);
    }

    @Override
    public List<Favorite> findAll() {
        return favoriteRepository.findAll();
    }

    @Override
    public void deleteById(Integer idBook) {
        favoriteRepository.deleteById(idBook);
    }

}