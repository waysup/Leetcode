import java.util.*;

public class Subdomain_Visit_Count {


    public static void main(String[] args){
        String[] domains = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> sub_domain_cnt_list = null;

        Subdomain_Visit_Count solver = new Subdomain_Visit_Count();
        sub_domain_cnt_list = solver.subdomainVisits(domains);
        for (String s: sub_domain_cnt_list){
            System.out.println(s);
        }
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        String domain;
        int domain_cnt;

        HashMap<String, Integer> mapped_domain_cnt = new HashMap<>();

        for (String cpdomain: cpdomains){
            domain = cpdomain.split(" ")[1];
            domain_cnt = Integer.valueOf(cpdomain.split(" ")[0]);
            //put subdomains into hash map
            char[] domain_chars = domain.toCharArray();
            int index = domain_chars.length - 1;
            while (index >= 0)
            {
                if (domain_chars[index] == '.'){
                    String subdomain = domain.substring(index+1);
                    Integer base;
                    if ((base=mapped_domain_cnt.get(subdomain)) != null){
                        mapped_domain_cnt.put(subdomain, domain_cnt+base);
                    }
                    else
                        mapped_domain_cnt.put(subdomain, domain_cnt);
                }
                index--;
            }
            Integer base = 0;
            if ((base=mapped_domain_cnt.get(domain)) != null){
                mapped_domain_cnt.put(domain, domain_cnt+base);
            }
            else
                mapped_domain_cnt.put(domain, domain_cnt);
        }


        List<String> retList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: mapped_domain_cnt.entrySet()){
            retList.add(entry.getValue() + " " + entry.getKey());
        }
        return retList;
    }
}

//    A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.
//
//        Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
//
//        We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
//
//Example 2:
//        Input:
//        ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
//        Output:
//        ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
//        Explanation:
//        We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.