package com.apicodetest.model;

/**
 * The type Build string.
 */
public class BuildString {

    /**
     * Build a string.
     *
     * @param fizzBuzzDAO the fizz buzz dao
     * @return the string
     */
    public String buildAString(FizzBuzzDAO fizzBuzzDAO) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Most frequent Int1 : ");
        sb.append(fizzBuzzDAO.getStatInt1().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Int1 : ");
        sb.append(fizzBuzzDAO.getStatInt1().get(1));
        sb.append("\n");
        sb.append("Most frequent Int2 : ");
        sb.append(fizzBuzzDAO.getStatInt2().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Int2 : ");
        sb.append(fizzBuzzDAO.getStatInt2().get(1));
        sb.append("\n");
        sb.append("Most frequent Limit : ");
        sb.append(fizzBuzzDAO.getStatLimit().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Limit : ");
        sb.append(fizzBuzzDAO.getStatLimit().get(1));
        sb.append("\n");
        sb.append("Most frequent str1 : ");
        sb.append(fizzBuzzDAO.getStatStr1().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Str1 : ");
        sb.append(fizzBuzzDAO.getStatStr1().get(1));
        sb.append("\n");
        sb.append("Most frequent str2 : ");
        sb.append(fizzBuzzDAO.getStatStr2().get(0));
        sb.append("\n");
        sb.append("Number of occurrence for Str2 : ");
        sb.append(fizzBuzzDAO.getStatStr2().get(1));
        sb.append("\n");
        sb.append("Number of POST call : ");
        sb.append(fizzBuzzDAO.getSize());
        return sb.toString();
    }
}
