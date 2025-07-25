package ecommerce.ecommerce_backend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @OneToOne
    private UserEntity user ;

    @OneToMany(mappedBy = "cart" , cascade = CascadeType.ALL , orphanRemoval = true)
    private Set<CartItem> cartItems = new HashSet<>() ;

    private double totalSellingPrice ;

    private int totalItem ;

    private int totalMrpPrice ;


    private int discount ;

    private String couponCode ;





}
