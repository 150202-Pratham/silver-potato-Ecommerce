package ecommerce.ecommerce_backend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ecommerce.ecommerce_backend.Domain.UserRole;
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
public class UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    private String fullName ;

    private String mobile ;


//    For Role We will Construct Enum ;

    private UserRole role  = UserRole.ROLE_CUSTOMER ;

    @OneToMany
    private Set<Address> address = new HashSet<>();

    @ManyToMany
    @JsonIgnore
    private Set<Coupon> usedCoupon = new HashSet<>() ;










}
