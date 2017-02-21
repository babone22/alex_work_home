import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by alex on 14/01/2017.
 */
public class test {
    public static void main(String[] args) throws Throwable {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);
//
//        String user = "root";
//        String password = "hwroot";
//        String address = "192.168.100.10";
//
//        SSHClient ssh = new SSHClient();
//        ssh.addHostKeyVerifier(
//                new HostKeyVerifier() {
//                    @Override
//                    public boolean verify(String s, int i, PublicKey publicKey) {
//                        return true;
//                    }
//                });
//        ssh.connect(address);
//        ssh.authPassword(user,password);
//        Session session = ssh.startSession();
//        session.allocateDefaultPTY();
//        Session.Command cmd = session.exec("cat /opt/alex.txt");
//        String test = String.valueOf(cmd);
        testRest.makeGetAsObject("http://localhost:3000/api/products");

    }
}
