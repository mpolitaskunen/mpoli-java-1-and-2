/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.*;

/**
 *
 * @author seppo.taskunen
 */
public class RatingRegister {
    private Map<Film, List<Rating>> kartta;
    private Map<Person, Map<Film, Rating>> persons;
    
    public RatingRegister() {
        this.kartta = new HashMap<Film,List<Rating>>();
        this.persons = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if(!this.kartta.containsKey(film)){
            this.kartta.put(film, new ArrayList<Rating>());
        }
        this.kartta.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if(!this.persons.containsKey(person)) {
            this.persons.put(person, new HashMap<Film,Rating>());
            this.persons.get(person).put(film, rating);
            addRating(film,rating);
        } else if (!this.persons.get(person).containsKey(film)) {
            this.persons.get(person).put(film, rating);
            addRating(film,rating);
        }
    }
    
    public Rating getRating(Person person, Film film) {
        if(!this.persons.containsKey(person)) {
            return Rating.NOT_WATCHED;
        } else if(!this.persons.get(person).containsKey(film)) {
            return Rating.NOT_WATCHED;
        }
        return this.persons.get(person).get(film);
    }
    
    public List<Rating> getRatings(Film film) {
        return this.kartta.get(film);
    }
    
    public List<Person> reviewers() {
        return new ArrayList<Person>(this.persons.keySet());
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if(!this.persons.containsKey(person)) {
            return new HashMap();
        }
        return this.persons.get(person);
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return this.kartta;
    }
}
