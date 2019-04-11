package com.mycompany.store.repository;

import com.mycompany.store.domain.Shipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Shipment findOneByIdAndInvoiceOrderCustomerUserLogin(Long id, String login);
    Page<Shipment> findAllByInvoiceOrderCustomerUserLogin(String login, Pageable pageable);
}
