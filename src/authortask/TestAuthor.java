package authortask;

import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email;
        email =sc.nextLine();
        Author author = new Author("name", "djsfnjdfn", 'n');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.toString());
        author.setEmail(email);
        System.out.println(author.toString());
    }
}
