public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String not;
    private String str;

    public CodeWordChecker(int min,int max,String not)
    {

        this.min=min;
        this.max=max;
        this.not=not;
    }
    public CodeWordChecker(String not) {
        this.min = 6;
        this.max = 20;
        this.not = not;

    }

    public boolean isValid(String str)
    {
        if(((str.indexOf(not))!=-1)||(str.length()<min)||(str.length()>max))
        {
            return false;
        }
        return true;
    }
}
