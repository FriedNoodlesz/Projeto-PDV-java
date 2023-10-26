/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Produtos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Andre.infra
 */
public class dbController {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopLinePU");
   private final  EntityManager em = emf.createEntityManager();
    
   public void getProdutos(){
       em.getTransaction().begin();
      Produtos entity = em.find(Produtos.class, 1);
      em.getTransaction().commit();
      
      if (entity != null) {
        System.out.println("Produto ID: " + entity.getId());
        System.out.println("Nome do Produto: " + entity.getNome());
        System.out.println("Preço do Produto: " + entity.getPreco());
        // Adicione outros campos conforme necessário
    } else {
        System.out.println("Produto não encontrado.");
    }
    }
   

}
