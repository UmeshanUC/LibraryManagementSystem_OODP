package UIs.Cli;

import Models.Book;
import Models.Member;
import Stores.StoreAdapter;
import UIs.PageBase;

import java.util.List;

public class ShowMembersPage extends PageBase {
    public ShowMembersPage(StoreAdapter dataStore) {
        super(dataStore);
    }

    @Override
    protected char execute() {
        List<Member> members = dataStore.getStore().getAllMembers();
        int memberCount = members.size();

        System.out.println(memberCount + " members were found");
        if (memberCount > 0) {
            for (int i = 0; i < members.size(); i++) {
                System.out.printf("\t%s. %s%n", i + 1, members.toArray()[i].toString());
            }
        }

        // Wait for ENTER to continue
        getUserStringInput("");
        return 'b';
    }
}
