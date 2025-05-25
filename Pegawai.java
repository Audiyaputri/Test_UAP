package AbstractInterface;
/**
 *
 * @author audiya
 */
public abstract class Pegawai {    
    String nama;
    public Pegawai(){        
    }
    
    public Pegawai (String nama){
        this.nama = nama;
    }
    abstract void Detail();
}
