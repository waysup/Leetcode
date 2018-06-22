import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {

    public static void main(String[] args) {
        Restore_IP_Addresses solver = new Restore_IP_Addresses();


        List<String> retList = solver.restoreIpAddresses("02550252");

        for (String ip : retList) {
            System.out.println(ip);
        }
    }

    public List<String> restoreIpAddresses(String s) {

        ArrayList<String> retList = new ArrayList<>();
        for (int one = 1; one <= 3; one++)
            for (int two = 1; two <= 3; two++)
                for (int three = 1; three <= 3; three++)
                    for (int four = 1; four < 4; four++) {
                        if (one + two + three + four == s.length()) {
                            int sec1 = Integer.valueOf(s.substring(0, one));
                            int sec2 = Integer.valueOf(s.substring(one, one + two));
                            int sec3 = Integer.valueOf(s.substring(one + two, one + two + three));
                            int sec4 = Integer.valueOf(s.substring(one + two + three, one + two + three + four));
                            if (sec1 < 256 && sec2 < 256 && sec3 < 256 && sec4 < 256) {
                                String ip = String.valueOf(sec1) + "." + String.valueOf(sec2) + "." + String.valueOf(sec3) + "." + String.valueOf(sec4);
//                                eliminate ips whose sector starts with 0
                                if (ip.length() == s.length() + 3)
                                    retList.add(ip);
                            }
                        }
                    }

        return retList;

    }
}
