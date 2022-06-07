
package com.Banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banque.entities.Client;

/**
 * @author Aboubakar
 *
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

}
