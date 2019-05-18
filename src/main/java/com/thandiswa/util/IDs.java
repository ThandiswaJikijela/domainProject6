package com.thandiswa.util;

import java.util.UUID;

public class IDs {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
