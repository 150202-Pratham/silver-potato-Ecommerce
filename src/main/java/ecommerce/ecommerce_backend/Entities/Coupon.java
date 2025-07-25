package ecommerce.ecommerce_backend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Coupon {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String code ;

    private double discountPercentage ;

    private LocalDate  validityStateDate;

    private LocalDate validityEndDate ;

    private double minimumOrderValue ;

    private boolean isActive = true ;

    @ManyToMany(mappedBy = "usedCoupon")
    private Set<UserEntity> usedByUsers = new HashSet<>() ;






}
