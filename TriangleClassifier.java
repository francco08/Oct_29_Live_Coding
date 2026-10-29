/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatementlab;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class TriangleClassifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ans = classifyTriangle(4, 4, 12);
        System.out.println(ans);
    }
    
    static int classifyTriangle(double x, double y, double z) {
        int status;
        if (x <= 0 || y <= 0 || z == 0) {
            status = 0;
        } else if (x + y <= z || y + z <= x || z + x <= y) {
            status = 0;
        } else if (x == y && y == z) {
            status = 1;
        } else if (x == y || y == z || z == x) {
            status = 2;
        } else {
            status = 3;
        }
        
        return status;
    }
}