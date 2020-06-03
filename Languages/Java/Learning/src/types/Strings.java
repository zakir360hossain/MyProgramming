package types;

public class Strings {
    public static void main(String[] args) {
        String s = "Butterfly";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.compareTo("butterfly"));
        System.out.println(s.concat(" wings are beautiful"));
        System.out.println(s.compareToIgnoreCase("butterfly"));
        System.out.println(s.hashCode());
        System.out.println(s.substring(0, 6));
        System.out.println(s.indexOf("tt"));
        System.out.println(s.contains("Butter"));
        //See oracle for more methods


        //StringBuffer and StringBuilder are types to create mutable string.
        //StringBuffer is thread-safe, but StringBuilder is not.
        StringBuffer s2 = new StringBuffer("Master");
        s2.append("mind");
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder("Decoherence");
        s3.insert(0, "Quantum ");
        System.out.println(s3);

    }
}


/*

  String is a non-primitive type in Java. It refers to an object.
  String is immutable, thus does not need constructor.

  Implemented Interfaces: Serializable, CharSequence, Comparable<String>

  1. substring (beginIndex, *endIndex)
  2. equals(String obj) compares the reference of the object, unlike "==" which compares the content.

 */

