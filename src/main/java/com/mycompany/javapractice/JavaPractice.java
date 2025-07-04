/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractice;
/**
 *
 * @author Malhotra Computer
 */
public class JavaPractice {

    public static void main(String[] args) {
        
        SIngletonClass single = SIngletonClass.getInstance();
        System.out.println("Hello!");
        RegistrationForm screen = new RegistrationForm();
        screen.setVisible(true);
                }
}
