package Dop_HW;

public class Main {
    public static void main(String[] args) {

        String s = "bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb\n" +
                " quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s\n" +
                " pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag\n" +
                "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx\n" +
                "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba\n" +
                " auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk\n" +
                " cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd\n" +
                "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob\n" +
                "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf\n" +
                "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan\n" +
                "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv\n" +
                "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq\n" +
                " ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh\n" +
                "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk\n" +
                "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa\n" +
                "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb\n" +
                "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs\n";

        System.out.println(count(s));

    }
    static int count(String s) {
        int count = 0;
        int temp = 1;
        int temp1 = 0;

        char c;
        if (s.length() == 0) {
            return 0;
        } else {
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
                else if (c == '\n'){
                    count = count - temp1;
                    System.out.println("Результат для строки " + temp + " = " + count);
                    count = temp1;
                    temp++;
                }
            }
            return count;
        }
    }
}
