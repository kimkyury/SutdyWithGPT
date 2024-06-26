package org.bnksys.chat.entities;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "chatrooms")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Chatroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Timestamp createdAt;

    private Chatroom(String name) {
        this.name = name;
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

    public static Chatroom of(String name) {
        return new Chatroom(name);
    }
}
