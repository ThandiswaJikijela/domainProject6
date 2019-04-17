package factory.Treatment.Body;

import domain.Treatment.Body.BodyScrub;

public class BodyScrubFactory {
    public static BodyScrub getBodyScrub (String grittyIngredients) {
        return new BodyScrub.Builder().grittyIngredients(grittyIngredients)
                .build();
    }
}
