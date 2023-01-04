/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.israa.buku.repository;

import com.israa.buku.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IIISI
 */
@Repository
public interface BukuRepository extends JpaRepository<Buku, Long>{
    
    public Buku findByBukuId(Long bukuId);
    
    public Buku save(Buku buku);
}
