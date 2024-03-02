class Solution {

    public String reverseStr(String s, int k) {
        List<String> list = new ArrayList<>();

        String temp = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(i);
            count++;
            if (count == (2 * k)) {
                list.add(temp);
                count = 0;
                temp = "";
            }
        }

        if (count > 0) {
            list.add(temp);
        }

        String ans = "";
        for (String str : list) {
            if (str.length() == (2 * k) || str.length() >= k) {
                String first_half = str.substring(0, k);
                String second_half = str.substring(k);

                ans = (ans + rev(first_half) + second_half);
            } else {
                ans = ans + rev(str);
            }
        }

        return ans;
        //         String[] str = s.split(" ");
        //         String s1 = "";
        //         for (int i = 0; i < str.length; i=i+k) {
        //             String temp = rev(str[i]);
        //             System.out.print(temp);
        //             // str[i] = temp;
        //             // System.out.print(Arrays.toString(str));
        //         }
        //         return s;
        //     }

        //     public String rev(String s) {
        //         String newStr = "";
        //         for (int i = s.length() - 1; i >= 0; i--) {
        //             newStr += s.charAt(i);
        //         }
        //         return newStr;
    }

    public String rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
// String ans = rev(s.substring(0,k));
//         // System.out.println(ans);
//         ans+= s.substring(k,s.length());
//         System.out.println(ans);
//          return ans;
//     }
