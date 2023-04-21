package UIs;

import java.util.Scanner;

public abstract class PageBase implements Page{
    private Scanner input = new Scanner(System.in);
    public String GetUserInput(){
        return input.nextLine();
    }
    @Override
    public String show() {
        return null;
    }
}
