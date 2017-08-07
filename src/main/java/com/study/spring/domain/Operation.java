package com.study.spring.domain;

import javax.persistence.*;

/**
 INSERT INTO `operation` (`id`, `name`, `possible_to_create`, `possible_to_read`, `possible_to_update`, `possible_to_delete`) VALUES
 (1001, 'CREATE', 1, 0, 0, 0),
 (1002, 'READ', 0, 1, 0, 0),
 (1003, 'UPDATE', 0, 0, 1, 0),
 (1004, 'DELETE', 0, 0, 0, 1),
 (1005, 'CREATE&READ', 1, 1, 0, 0),
 (1006, 'CREATE&UPDATE', 1, 0, 1, 0),
 (1007, 'CREATE&DELETE', 1, 0, 0, 1),
 (1008, 'CREATE&READ&UPDATE', 1, 1, 1, 0),
 (1009, 'CREATE&UPDATE&DELETE', 1, 0, 1, 1),
 (1010, 'CREATE&READ&UPDATE&DELETE', 1, 1, 1, 1);
 */

@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int possibleToCreate;

    @Column(nullable = false)
    private int possibleToRead;

    @Column(nullable = false)
    private int possibleToUpdate;

    @Column(nullable = false)
    private int possibleToDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPossibleToCreate() {
        return possibleToCreate;
    }

    public void setPossibleToCreate(int possibleToCreate) {
        this.possibleToCreate = possibleToCreate;
    }

    public int getPossibleToRead() {
        return possibleToRead;
    }

    public void setPossibleToRead(int possibleToRead) {
        this.possibleToRead = possibleToRead;
    }

    public int getPossibleToUpdate() {
        return possibleToUpdate;
    }

    public void setPossibleToUpdate(int possibleToUpdate) {
        this.possibleToUpdate = possibleToUpdate;
    }

    public int getPossibleToDelete() {
        return possibleToDelete;
    }

    public void setPossibleToDelete(int possibleToDelete) {
        this.possibleToDelete = possibleToDelete;
    }
}