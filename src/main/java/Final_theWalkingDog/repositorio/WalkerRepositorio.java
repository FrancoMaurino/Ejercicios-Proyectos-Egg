/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_theWalkingDog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Final_theWalkingDog.entidades.Walker;

/**
 *
 * @author JP
 */
@Repository
public interface WalkerRepositorio extends JpaRepository<Walker,String> {
    
}
