package com.headfirst.phraseomatic;

public class PhraseOMatic {
    public static void main(String[] args) {


        String[] wordListOne = {"agnostic", "opinionated", "voice activated",
                "haptically driven", "extensible", "reactive", "agent based", "functional",
                "Ai enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous",
                "event driven", "pub-sub", "IoT", "cloud native", "service oriented",
                "containerized", "serverless", "microservices", "distributed ledger"};

        String[] wordListThree = {"framework", "library", "DSL", "REST API",
                "repository", "pipeline", "service mesh", "architecture", "perspective",
                "design", "orientation"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLenght);
        int rand2 = randomGenerator.nextInt(twoLenght);
        int rand3 = randomGenerator.nextInt(threeLenght);

        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
