public class percentageStates {
        public static void main(String[] args){
                double sp = 67.83643;
                double rj = 36.67866;
                double mg = 29.22988;
                double es = 27.16548;
                double out = 19.84953;
                double total = sp + rj + mg + es + out;

                System.out.println(total);

                double percStateSp = sp/total*100;
                double percStateRj = rj/total*100;
                double percStateMg = mg/total*100;
                double percStateEs = es/total*100;
                double percStateOut = out/total*100;

                System.out.println("A porcentagem de SP é" + " "+ percStateSp + "%");
                System.out.println("A porcentagem de RJ é" + " "+ percStateRj + "%");
                System.out.println("A porcentagem de MG é" + " "+ percStateMg + "%");
                System.out.println("A porcentagem de ES é" + " "+ percStateEs + "%");
                System.out.println("A porcentagem de Outros é"+ " "+ percStateOut + "%");
        }
}
