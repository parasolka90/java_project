package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.sesame)
                .burgers(2)
                .sauce(Sauce.mayo)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.bacon)
                .ingredient(Ingredients.cheese)
                .ingredient(Ingredients.pickles)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.cheese));
    }

}
