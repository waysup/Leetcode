public class Validate_IP_Address {


    public static void main(String[] args) {
        String ip4 = "0.0.0.299";
        String ip42 = "172.16.254.1";
        String ip6 = "2001:db8:85a3:0:0:8A2E:0370:7334";
        String ip62 = "2001:0db8:85a3:1:0:8A2E:0370:7334";
        Validate_IP_Address solver = new Validate_IP_Address();
        System.out.println(solver.validIPAddress(ip4));
        System.out.println(solver.validIPAddress(ip42));
        System.out.println(solver.validIPAddress(ip6));
        System.out.println(solver.validIPAddress(ip62));

    }

    public String validIPAddress(String IP) {
        if (IP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))
            return "IPv4";
        if (IP.matches("([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}"))
            return "IPv6";
        return "Neither";
    }
}
