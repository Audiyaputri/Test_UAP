package AbstractInterface;
/**
 *
 * @author audiya
 */
public class TestGaji {
    public TestGaji() {
        Gaji gaji = new Gaji("Tono", 2500000);
        gaji.Detail();
    }
    public static void main(String[]args) {
        TestGaji testGaji = new TestGaji();                
                
    }
}
