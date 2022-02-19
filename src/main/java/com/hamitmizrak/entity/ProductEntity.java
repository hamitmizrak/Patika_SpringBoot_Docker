package com.hamitmizrak.entity;

import com.hamitmizrak.audit.BaseEntityAudit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

@Entity
@Table( name = "product")
public class ProductEntity extends BaseEntityAudit {

    @Column( name= "product_name")
    private String productName;

    @Column( name="product_trade")
    private String productTrade;

}
