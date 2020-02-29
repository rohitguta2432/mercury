package com.api.mercury.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "role_permissions")
@EntityListeners(AuditingEntityListener.class)
public class RolePermissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID roleId;
    private UUID permissionId;
    @CreatedDate
    private Date createdAt;
    private Date updatedAt;

}
