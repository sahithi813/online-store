package com.mycompany.store.repository;

import com.mycompany.store.domain.ProductOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ProductOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    ProductOrder findOneByIdAndCustomerUserLogin(Long id, String login);
    Page<ProductOrder> findAllByCustomerUserLogin(String login, Pageable pageable);
}
