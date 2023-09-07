package com.mycompany.loginuser;

import java.util.Scanner;

public class LoginUser {
    
                                                          // throws APARTADO DE SLEEP
    public static void main(String[] args) throws InterruptedException {

        // Usuario Predeterminado
        String Login = "ipchile";
        String Password = "ipchile";

        // Bucle Inicio De Sesion 3 Intentos
        for (int i = 3; i > -1; i--) {                  // En este caso va del 3 al 0 (1 - 0- -1)

            // Limpiador de pantalla con BUCLE
            for (int j = 0; j < 10; j++) {
                
                System.out.println("");
                
            }

         Scanner cuenta = new Scanner(System.in);
         
            System.out.println("======================");
            System.out.println(" SISTEMA DE IPCHILE ");
            System.out.println("  ¡inicio de sesion!  ");
            System.out.println("");
            System.out.print("Usuario: ");
            String usuario = cuenta.nextLine();
            System.out.print("contraseña: ");
            String pass = cuenta.nextLine();
            System.out.println("======================");
            
            System.out.println("Espere un momento...");

            // Congelar pantalla 4s (CADA 1000 es segundo)
            Thread.sleep(4000);

            // Limpiador de pantalla con BUCLE
            for (int j = 0; j < 10; j++) {
                
                System.out.println("");
                
            }

            // Si logra coincidir el usuario
            if (usuario.equals(Login) && pass.equals(Password)) {
                
                System.out.println("======================");
                System.out.println("    ¡BIENVENID@!   ");
                System.out.println(" Has iniciado sesion ");
                System.out.println("    como IPCHILE ");
                System.out.println("======================");
                
             break;
               
                // Se bloqueara la cuenta al llegar a los 3 intentos que es 0
            } else if (i == -1) {
                
                System.out.println("======================");
                System.out.println("  ¡HAS SIDO BLOQUEADO! ");
                System.out.println("");
                System.out.println("Contacta con un administrador");
                System.out.println("======================");
                
             break;

                // Si no logra ninguna de las anteriores
            } else {
                
                System.out.println("======================");
                System.out.println("    ¡HAS FALLADO!    ");
                System.out.println("");
                System.out.println("TE QUEDAN " + i + "° INTENTOS");
                System.out.println("Vuelve a intentarlo...");
                System.out.println("======================");

                // Congelar pantalla 3s (CADA 1000 es 1 segundo)
                Thread.sleep(3000);
            }
             
        }   // Fin BUCLE

        // CODIGO TERMINO
    }

}
