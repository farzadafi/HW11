import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa","ab","cat","dog","hash","angel","glass","frame","farzad","afshar");
        list.stream().collect(Collectors.groupingBy(String::length)).forEach((k, v) -> System.out.println(String.format("{%d=%s}",k,v)));
        //System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));

    }






}
