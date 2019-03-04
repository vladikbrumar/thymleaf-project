package com.someproject.th0403.repository;

import com.someproject.th0403.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
