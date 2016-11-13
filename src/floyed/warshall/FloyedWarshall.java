/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package floyed.warshall;
import java.util.Scanner;

/**
 *
 * @author nuhin13
 */
public class FloyedWarshall {
    private static int INFINITY;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int adjacency_matrix[][];
        int numberofvertices;
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        numberofvertices = scan.nextInt();
 
        adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1];
        System.out.println("Enter the Weighted Matrix for the graph");
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                adjacency_matrix[source][destination] = scan.nextInt();
                if (source == destination)
                {
                    adjacency_matrix[source][destination] = 0;
                    continue;
                }
                if (adjacency_matrix[source][destination] == 0)
                {
                    adjacency_matrix[source][destination] = INFINITY;
                }
            }
        }
 
        System.out.println("The Transitive Closure of the Graph");
        floyed_warshall_algorihtom floydwarshall = new floyed_warshall_algorihtom(numberofvertices);
        floydwarshall.floydwarshall(adjacency_matrix);
        scan.close();
    }
    
    }

