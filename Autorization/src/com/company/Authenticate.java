package com.company;

public class Authenticate {
    public static void main(String[] args) {
        System.out.println(verify("login1", "password1", "password1"));
        System.out.println(verify("ввамс", "васв", "васв"));
        System.out.println(verify("login1login1login1login1login1login1login1login1", "password1password1password1password1password1", "password1"));
    }
    private static boolean verify(String login, String password, String confPassword){
        try {
            if (login.length()>20){
                throw new WrongLoginException("Wrong Login");
            }
            if (password.length()>20 || password.equals(confPassword)){
                throw new WrongPasswordExeption("Wrong password");
            }
        } catch (WrongLoginException | WrongPasswordExeption e) {
           System.out.println(e.getMessage());
        } finally {
            System.out.println(login);
            System.out.println(password);
            System.out.println(confPassword);
        }
        return true;
    }
}
