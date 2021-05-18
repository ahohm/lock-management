package com.akkurad.lockmanagement.model;


import com.akkurad.lockmanagement.model.enums.LocalState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VirtualDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //  @Pattern(regexp = "", message = "password doesn't match.")
    private String password;
    //  @Pattern(regexp = "", message = "password doesn't match.")
    private String localisation;
    @NotNull
    private LocalState currentState;

    @OneToOne
    private Lockz lockz;
}
