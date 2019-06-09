/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author seppo.taskunen
 */
public class Reference {
    private RatingRegister rateReg;
    
    
    public Reference(RatingRegister rateReg) {
        this.rateReg = rateReg;
    }
    
    public Film recommendFilm(Person person) {
        if(this.rateReg.getPersonalRatings(person).isEmpty()){
            List<Film> films = new ArrayList<Film>(this.rateReg.filmRatings().keySet());
            Collections.sort(films, new FilmComparator(this.rateReg.filmRatings()));
            return films.get(0);
        }
        
        List<Person> reviewersSortedBySimilarity = reviewersSortBySimilarity(person);
        
        return getRecommendedFilm(person, reviewersSortedBySimilarity);
    }
    
    private List<Person> reviewersSortBySimilarity(Person person) {
        Map<Person, Integer> reviewerSimilarity = reviewerSimilarity(this.rateReg.getPersonalRatings(person));
        
        List<Person> similarReviewers = new ArrayList<Person>(reviewerSimilarity.keySet());
        Collections.sort(similarReviewers, new PersonComparator(reviewerSimilarity));
        
        return similarReviewers;
    }
    
    private Map<Person,Integer> reviewerSimilarity(Map<Film,Rating> filmRatings) {
        Map<Person,Integer> reviewerSimilarity = new HashMap<Person,Integer>();
        
        for(Person person:this.rateReg.reviewers()) {
            int similarity = 0;
            
            for(Film film:filmRatings.keySet()) {
                similarity += filmRatings.get(film).getValue() * this.rateReg.getRating(person, film).getValue();
            }
            
            if(similarity > 0) {
                reviewerSimilarity.put(person, similarity);
            }
        }
        return reviewerSimilarity;
    }
    
    private Film getRecommendedFilm(Person person, List<Person> reviewersSortedBySimilarity) {
        Map<Film,Rating> personsSeenFilms = this.rateReg.getPersonalRatings(person);
        
        for(Person reviewer: reviewersSortedBySimilarity) {
            if (reviewer == person) {
                continue;
            }
            
            for(Film film:this.rateReg.getPersonalRatings(reviewer).keySet()) {
                if(personsSeenFilms.containsKey(film)) {
                    continue;
                }
                
                if(this.rateReg.getPersonalRatings(reviewer).get(film).getValue() > 1) {
                    return film;
                }
            }
        }
        return null;
    }
}
