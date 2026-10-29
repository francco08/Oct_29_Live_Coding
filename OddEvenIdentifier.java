/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dasmariñas2008;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class OddEvenIdentifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ans = oddEven(20);
        System.out.println(ans);
    }
    
    static int oddEven(int odev) {
        int status;
        if (odev % 2 == 0) {
            status = 1;
        } else {
            status = 0;
        }
    return status;
    }
}