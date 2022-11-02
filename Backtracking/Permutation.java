public class Permutation {
    
    public static void findPermutation(String str, String ans) {
        // base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion, time complexity = O(n*n!)
        for(int i=0; i<str.length(); i++) {
            char pickedChar = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String restStr = str.substring(0,i) + str.substring(i+1);// (0, i) yaha 'i' excluded he, yaha like upper
            // ke comment me 'c' hat gya vo hoga. aur (i+1,
            // yaha kuch nahi bhi likho tho uska mtlb n-1
            // hota he.)
            findPermutation(restStr, ans+pickedChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}
