package UIs;

import Stores.StoreAdapter;

import java.util.Scanner;

public abstract class PageBase implements Page {
    private final Scanner input = new Scanner(System.in);
    protected final StoreAdapter dataStore;

    /**
     * Display an alert on any action result such as success alert or failure alert
     *
     * @param label alert to be displayed
     */
    protected void alert(String label) {
        System.out.printf("\n\n --- %s ---\n\n%n", label);
    }

    public PageBase(StoreAdapter dataStore) {
        this.dataStore = dataStore;
    }

    protected char getUserActionInput() {
        return input.next().charAt(0);

    }

    /**
     * Wait for user interaction to continue cli execution
     */
    protected void pause() {
        getUserStringInput("Press any key to continue...\n");
    }

    protected String getUserStringInput(String label) {
        System.out.print(label);
        return input.nextLine();
    }

    /**
     * Re-render the page if a child page is navigated backwards
     * @return returns the result of the page's user input
     */
    protected char rerenderOnBackNavigation() {
        return this.show();
    }

    protected abstract char execute();

    protected void exitApp(int retCode) {
        System.exit(retCode);
    }

    /**
     * Show the page
     *
     * @return users input if there's not any matching case
     * if the return in char 'b', the return value should be checked to navigate to previous page
     */
    public char show() {
        while (true) {
            char res = execute();

            if (!Character.isLetterOrDigit(res)) {
                System.out.println("Error response. Retry...");
                continue;
            }
            return res;
        }
    }
}
