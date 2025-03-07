package com.isia.tfm.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SessionExercisePK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer sessionId;
    private Integer exerciseId;

}
