package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;

public class BodyScrubFactory {
    public static BodyScrub getBodyScrub (String grittyIngredients) {
        return new BodyScrub.Builder().grittyIngredients(grittyIngredients)
                .build();
    }
}
