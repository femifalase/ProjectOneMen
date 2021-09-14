package com.gw.projectonemen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public abstract class Role {
    protected String roleName;
    protected String roleDescription;
}