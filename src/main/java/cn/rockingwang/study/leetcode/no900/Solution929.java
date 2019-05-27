package cn.rockingwang.study.leetcode.no900;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {

    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<String>();
        for (String email : emails) {
            int index = email.indexOf("@");
            String localName = email.substring(0, index);
            String domainName = email.substring(index);
            localName = localName.replaceAll("\\.", "");
            if (localName.length() > 1 && localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf("+"));
            }
            emailSet.add(localName + domainName);
        }
        for (String email : emailSet) {
            System.out.println(email);
        }
        return emailSet.size();
    }

    public static void main(String[] args) {
        String[] emails = new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(emails);
    }

}
