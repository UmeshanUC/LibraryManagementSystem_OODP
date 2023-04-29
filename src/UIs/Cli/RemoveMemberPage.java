package UIs.Cli;

import Builders.MemberBuilder;
import Exceptions.StoreException;
import Models.Member;
import Stores.StoreAdapter;
import UIs.PageBase;

public class RemoveMemberPage extends PageBase {

    public RemoveMemberPage(StoreAdapter store) {
        super(store);
    }

    @Override
    protected char execute() {
        System.out.println("Enter the ID of the member to be removed");

        try {
            Member removingMember = new MemberBuilder()
                    .setId(Integer.parseInt(getUserStringInput("\tMember ID: ")))
                    .GetMember();

            dataStore.remove(removingMember);
        } catch (StoreException ex) {
            alert("Error occurred in removing Member");
        } catch (NumberFormatException numberFormatEx){
            alert("Input value error. ID should be an integer value.");
        }
        return 'b';
    }
}
