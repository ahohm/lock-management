package com.akkurad.lockmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, max = 30, message = "username length doesn't.")
    private String username;

    private String phoneNumber;

    @ManyToOne
    private Organization organization;

    @OneToMany
    private Collection<Lockz> lockzs;

    @OneToMany
    private Collection<Log> logs;
}
