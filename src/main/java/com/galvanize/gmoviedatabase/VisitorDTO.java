package com.galvanize.gmoviedatabase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class VisitorDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long visitorId;
    private String visitorName;

    public VisitorDTO(String visitorName) {this.visitorName=visitorName;}
}
