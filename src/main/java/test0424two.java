public class test0424two {
    public static void main(String[] args){

        int start,end;

        String text = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        start = text.indexOf("GET /") + 4;
        end = text.indexOf(" HTTP");

        System.out.println(text.substring(start,end));
    }
}
