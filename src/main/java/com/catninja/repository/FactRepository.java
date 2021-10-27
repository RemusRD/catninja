package com.catninja.repository;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

@Repository
public class FactRepository {
    private final List<String> facts = List.of(
            "The claws on the cat\u2019s back paws aren\u2019t as sharp as the claws on the front paws because the claws in the back don\u2019t retract and, consequently, become worn.",
            "Cats have individual preferences for scratching surfaces and angles. Some are horizontal scratchers while others exercise their claws vertically.",
            "Cats have \"nine lives\" thanks to a flexible spine and powerful leg and back muscles",
            "Cats have 3 eyelids.",
            "A domestic cat can run at speeds of 30 mph.",
            "Cats are extremely sensitive to vibrations. Cats are said to detect earthquake tremors 10 or 15 minutes before humans can.",
            "In the original Italian version of Cinderella, the benevolent fairy godmother figure was a cat.",
            "Every year, nearly four million cats are eaten in Asia.",
            "The Amur leopard is one of the most endangered animals in the world.",
            "Female cats are polyestrous"
    );

    public String getRandomFact() {
        Random rand = new Random();
        return facts.get(rand.nextInt(facts.size())) + ": from our java application";
    }
}
