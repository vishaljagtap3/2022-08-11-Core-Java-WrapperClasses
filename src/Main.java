import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("No of Processors: " + runtime.availableProcessors());
        System.out.println("Max Memory: " + runtime.maxMemory());
        runtime.gc(); //request
        runtime.runFinalization(); //request

        Process process = runtime.exec("ls /home/vishal/java");
        InputStream in = process.getInputStream();
        StringBuffer stringBuffer = new StringBuffer();
        int val;
        while( (val = in.read()) != -1) {
            stringBuffer.append((char)val);
        }
        in.close();
        System.out.println(stringBuffer);

        runtime.exec("mkdir demo_dir");



        /*String strNum = "12345";
        int i = Integer.parseInt(strNum);*/

        /*System.out.println(Byte.MIN_VALUE + "  " + Byte.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "  " + Long.MAX_VALUE);
        */
        /*Float f1 = new Float(12.12);
        Float f2 = new Float(12.12f);
        Float f3 = new Float("12.12");

        System.out.println(f1 + " " + f2 + " " + f3);
        System.out.println(f1.compareTo(f2));*/

        /*Object [] arr = new Object[5];

        arr[0] = "BitCode";
        arr[1] = new Data();
        //arr[2] = 100;
        //arr[2] = new IntegerHolder(100);
        arr[2] = new Integer(100);
        arr[3] = new Character('A');
        arr[4] = new Boolean(true);


        Object obj = 100; //auto boxing
        Object obj1 = new Integer(100);

        //Integer i1 = new Integer(200);
        Integer i1 = 200; //auto boxing
        float f = i1.floatValue();


        int ival = i1.intValue();
        System.out.println("ival = " + ival);
        ival = i1; //auto unboxing
        System.out.println("ival = " + ival);*/

    }
}
