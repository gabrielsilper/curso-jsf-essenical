package com.github.gabrielsilper.repositories;

import com.github.gabrielsilper.models.Empresa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SchemaGeneration {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");

        EntityManager em = emf.createEntityManager();

        List<Empresa> lista = em.createQuery("from Empresa", Empresa.class)
                .getResultList();

        System.out.println(lista);

        em.close();
        emf.close();
    }
}
