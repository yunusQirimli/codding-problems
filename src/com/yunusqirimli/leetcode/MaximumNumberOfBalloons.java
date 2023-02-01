package com.yunusqirimli.leetcode;

// Maximum Number of Balloons
// https://leetcode.com/problems/maximum-number-of-balloons

public class MaximumNumberOfBalloons {

  public static void main(String[] args) {
    int n = new MaximumNumberOfBalloons().maxNumberOfBalloons(
        "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw");
    System.out.println(n);
  }

  public int maxNumberOfBalloons(String text) {
    int bCount = 0, aCount = 0, lCount = 0, oCount = 0, nCount = 0;

    for (char c : text.toCharArray()) {
      switch (c) {
        case 'b' -> bCount++;
        case 'a' -> aCount++;
        case 'l' -> lCount++;
        case 'o' -> oCount++;
        case 'n' -> nCount++;
      }
    }

    // find minimum number of instances for single and double letter
    int singleLetterMinInstanceNum = Math.min(bCount, Math.min(aCount, nCount));
    int doubleLetterMinInstanceNum = Math.min(lCount, oCount) / 2;

    return Math.min(singleLetterMinInstanceNum, doubleLetterMinInstanceNum);
  }

}
