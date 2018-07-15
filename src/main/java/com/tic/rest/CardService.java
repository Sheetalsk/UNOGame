package com.tic.rest;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

@Stateless
public class CardService {
    @PersistenceUnit(name = "unoPU")
    private EntityManager entityManager;

    public Card save(Card card) {
        this.entityManager.persist(card);
        return this.entityManager.find(Card.class, card.getId());
    }
}
