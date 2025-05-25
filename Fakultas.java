package AbstractInterface.Tugas;
/**
 * @author audiya
 */
public class Fakultas implements InformatikaInterface, SiskomInterface, Kampus{
    @Override
    public void dekan1(){
        System.out.println("Dekan Fakultas Informatika:         ");
    }
    @Override
    public void dosen1(){
        System.out.println("Dosen Fakultas Informatika:         ");
    }
    @Override
    public void mhs1(){
        System.out.println("Mahasiswa Fakultas Informatika:     ");
    }

    @Override
    public void dekan2(){
        System.out.println("Dekan Fakultas Sistem Komputer:     ");
    }
    @Override
    public void dosen2(){
        System.out.println("Dosen Fakultas Sistem Komputer:     ");
    }
    @Override
    public void mhs2(){
        System.out.println("Mahasiswa Fakultas Sistem Komputer: ");
    }
}
