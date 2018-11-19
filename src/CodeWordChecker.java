public class CodeWordChecker {
    private int min;
    private int max;
    private  String not;
    public CodeWordChecker(min,max,not)
    {
        this.min=min;
        this.max=max;
        this.not=not;
    }
    public CodeWordChecker(not) {
        this.min = 6;
        this.max = 20;
        this.not = not;
    }

    public static boolean isValid(String str)
    {
        if(str.indexOf(not))
    }
}
