package AbstractInterface.Tugas;
/**
 *
 * @author audiya
 */
public class Main {
    
    public static void main(String[] args) {
        Fakultas fakultas = new Fakultas();
        fakultas.dekan1();
        fakultas.dosen1();
        fakultas.mhs1();
        
        System.out.println("================================");
        fakultas.dekan2();
        fakultas.dosen2();
        fakultas.mhs2();            
       
    }    
}
