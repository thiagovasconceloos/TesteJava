/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import service.OperadorTeste;
import service.CriacaoModel;
import service.ResponseService;
import model.LabelCollection;
import model.LogisticAddress;




        
       
/**
 *
 * @author vasco
 */
public class Java {
         
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        OperadorTeste teste = new OperadorTeste();
        LabelCollection info = new LabelCollection();
        
        
            ResponseService respon = new ResponseService();
            System.out.println(info.getSenderData().getName());
            System.out.println(info.getSenderData().getPostalCode());
            System.out.println(info.getShippingData().getName());
            System.out.println(info.getShippingData().getPostalCode());
      
                 
         respon.setStatus(teste.criaEntrega(info.getSenderData().getName(),info.getShippingData().getName(),info.getSenderData().getPostalCode().replaceAll("[^0-9]",""),info.getShippingData().getPostalCode().replaceAll("[^0-9]",""),info.getWidthObject().toString()).getStatus());
                        
         
         System.out.println(respon.getStatus());
       
        
  
        
    }
    
}
