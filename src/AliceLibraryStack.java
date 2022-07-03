import java.util.Scanner;
import java.util.Stack;

public class AliceLibraryStack {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        //Scanner s = new Scanner(System.in);
        //String inpString = s.nextLine();
        String inpString = "/aanwhqmyncytw/hkubrvcqxgcehd/x/yewdyvpqj/cmrnml/grytru/cexmmfulqb/tfctehp/hmrzkosyvht\\vjrromqncbgsjcwhmlqidkyc\\axyhsrduoxayntuhqubvboseeziwjvrfagsbvtxjjb/exnajqapgxy/dwtztzbbdpoydnjipfizdfpmczgqvdmpvxbqubtygkfpdeonegf/z\\s\\ttirbhzko\\bbigwneyvtcx\\ndf\\kljdvbb\\cfnadtfhgoh\\fzqeidtgyandhnvbhaqf\\im\\fuqlctfeobssqyarhshg/kphlewnjnzn\\nsjz\\";


        Stack<Character> stack2 = new Stack<Character>();
        while(inpString.lastIndexOf("/") != -1){
            int innerWallOpen = inpString.lastIndexOf("/");
            int innerWallClose = inpString.indexOf("\\");
            int ind = inpString.lastIndexOf("/");

            while (!('\\' == (inpString.charAt(ind+1)))){
                stack2.push(inpString.charAt(ind+1));
                ind++;
            }
            StringBuilder rev= new StringBuilder();
            while(!stack2.empty()) rev.append(stack2.pop());
            inpString=inpString.replace(inpString.substring(innerWallOpen,innerWallClose+1),rev);
        }
        System.out.println(inpString);


    }


}
