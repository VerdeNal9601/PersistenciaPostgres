package com.PersistenciaPostgrest.practica.model;

import org.apache.catalina.User;

import javax.persistence.*;
import java.io.Serializable;



    @Entity
    @Table(name = "users")
    public class UserDto implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_user")
        private Long idUser;

        private String name;
        private String email;

        public UserDto() {
        }

        public UserDto(Long idUser,String name, String email) {
            this.idUser = idUser;
            this.name = name;
            this.email = email;
        }



        public Long getIdUser() {
            return idUser;
        }

        public void setIdUser(Long idUser) {
            this.idUser = idUser;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
