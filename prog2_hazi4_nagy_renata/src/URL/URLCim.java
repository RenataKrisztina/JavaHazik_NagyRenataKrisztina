/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URL;

/**
 *
 * @author Reni
 */
public class URLCim {
    
    private String protokoll;
    private String tartomany;
    private String eleresiut;

    public String getProtokoll() {
        return protokoll;
    }

    public String getTartomany() {
        return tartomany;
    }

    public String getEleresiut() {
        return eleresiut;
    }

    @Override
    public String toString() {
        return "URLCim{" + "protokoll=" + protokoll + ", tartomany=" + tartomany + ", eleresiut=" + eleresiut + '}';
    }

    public URLCim(String url_cim) throws URLCimException {
        // itt csak eldobjuk a kivetelt es nem kezeljük
        if( url_cim.length() < 5){
            throw new URLCimException(1,"Rövid cim");
        }
        if(!(url_cim.indexOf("://")!= -1 && url_cim.indexOf("://") == url_cim.lastIndexOf("://"))){
            throw new URLCimException(2,"Nem pontosan egyszer szerepel a ://");
        }
        String[] darab = url_cim.split("://");
        
        if(darab[0].equals("http") || darab[0].equals("ftp") || darab[0].equals("file")){
            this.protokoll = darab[0];
        }else{
            throw new URLCimException(3, "Nem megfelelo protokoll");
        }
        if(darab[1].contains("/") == false){
            this.eleresiut="";
            
            if(darab[1].contains(".") == false){
                throw new URLCimException(4,"Nem tartalmaz pontot");
            }
        }else{
            String[] darab2 = darab[1].split("\\.",-1); // in.unideb..hu. -1: hu. miatt tegyen ures sztinget
            for(String s:darab2){
                if(s.length() == 0){
                    throw new URLCimException(4," Ket pont egymas mellett ");
                    
                }
            }
            //if(darab2[darab2.length-1].length()<2)
        }
        
    }
    
    
    
}
