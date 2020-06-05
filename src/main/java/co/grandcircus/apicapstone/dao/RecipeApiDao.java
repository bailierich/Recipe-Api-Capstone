package co.grandcircus.apicapstone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.apicapstone.entity.Favorite;

public interface RecipeApiDao extends JpaRepository<Favorite, Long> {

}
