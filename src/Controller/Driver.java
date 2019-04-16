/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pelapor;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sifa user
 */
public class Driver {
    public static void main(String[] args) {
        List<Pelapor> l1 = new LinkedList<>();
        Pelapor p1 = new Pelapor();
        Pelapor p2 = new Pelapor();
        p1.register(p1,l1);
        p2.register(p2,l1);
        
      
        
        for(Pelapor x: l1){
            System.out.println("====================================");
            x.showData();
            System.out.println("====================================");
        }
        
    }
    }
