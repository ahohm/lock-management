package com.akkurad.lockmanagement.model;

import com.akkurad.lockmanagement.model.enums.LockType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Lockz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //  @Pattern(regexp = "", message = "password doesn't match.")
    private String serialNumber;
    //  @Pattern(regexp = "", message = "password doesn't match.")
    private String macAddress;
    //  @Pattern(regexp = "", message = "password doesn't match.")
    private String rssi;
    @NotNull
    private LockType type;

}
