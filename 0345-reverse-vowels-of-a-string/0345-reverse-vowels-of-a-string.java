class Solution {

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char str[] = s.toCharArray();
        HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        while (i < j) {
            // StringBuilder sb = new StringBuilder();
            if(set.contains(s.charAt(i)) && set.contains(s.charAt(j))){
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                i++; j--;
            }else if(set.contains(s.charAt(i))){
                j--;
            }else if(set.contains(s.charAt(j))){
                i++;
            }else{
                i++; j--;
            }
           //  if (
           //      s.charAt(i) == 'a' ||
           //      s.charAt(i) == 'e' ||
           //      s.charAt(i) == 'i' ||
           //      s.charAt(i) == 'o' ||
           //      s.charAt(i) == 'u' &&
           //      s.charAt(j) == 'a' ||
           //      s.charAt(j) == 'e' ||
           //      s.charAt(j) == 'i' ||
           //      s.charAt(j) == 'o' ||
           //      s.charAt(j) == 'u'
           //  ) {
           //      String temp = s.charAt(i);
           //      s.charAt(i) = s.charAt(j);
           //      s.charAt(j) = temp;
           //      sb.append(str).append(s.charAt(i)).append(s.charAt(j));
           //      i++;
           //      j--;
           //  }
           //  else if( 
           //      s.charAt(i) != 'a' ||
           //      s.charAt(i) != 'e' ||
           //      s.charAt(i) != 'i' ||
           //      s.charAt(i) != 'o' ||
           //      s.charAt(i) != 'u' &&
           //      s.charAt(j) == 'a' ||
           //      s.charAt(j) == 'e' ||
           //      s.charAt(j) == 'i' ||
           //      s.charAt(j) == 'o' ||
           //      s.charAt(j) == 'u'){
           //      i++;
           //  }
           // else if( 
           //      s.charAt(i) == 'a' ||
           //      s.charAt(i) == 'e' ||
           //      s.charAt(i) == 'i' ||
           //      s.charAt(i) == 'o' ||
           //      s.charAt(i) == 'u' &&
           //      s.charAt(j) != 'a' ||
           //      s.charAt(j) != 'e' ||
           //      s.charAt(j) != 'i' ||
           //      s.charAt(j) != 'o' ||
           //      s.charAt(j) != 'u'){
           //     j++;
           // }else{
           //      i++;
           //      j++;
           // }
            
        }
        return new String(str);
    }
}
