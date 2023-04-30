package UIs.Cli;

import Builders.MemberBuilder;
import Exceptions.StoreException;
import Models.Member;
import Stores.StoreAdapter;
import UIs.PageBase;

public class AddMemberPage extends PageBase {

    public AddMemberPage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Enter member details");
        Member member = new MemberBuilder()
                .setName(getUserStringInput("\tName: "))
                .GetMember();

        try {
            dataStore.store(member);
            alert("Saved successfully !");
        } catch (StoreException ex) {
            alert("Error occurred in adding member");
        }

        return 'b';
    }
}
