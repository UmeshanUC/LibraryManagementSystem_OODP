package Factories;

import Enums.Pages;
import Stores.StoreAdapter;
import UIs.Cli.*;
import UIs.Page;


public class PageFactory {
    public static Page Create(Pages page, StoreAdapter store) {
        switch (page) {
            case ShowAvailableBooks -> {
                return new ShowAvailableBooksPage(store);
            }
            case ShowBorrowedBooks -> {
                return new ShowBorrowedBooksPage(store);
            }
            case ShowOverdueBooks -> {
                return new ShowOverdueBooksPage(store);
            }
            case ShowMembers -> {
                return new ShowMembersPage(store);
            }
            default -> {
                // Homepage
                return new HomePage(store);
            }
            case MemberManage -> {
                return new MemberManagePage(store);
            }
            case BookManage -> {
                return new BookManagePage(store);
            }
            case LendBook -> {
                return new LendBookPage(store);
            }
            case ReturnBook -> {
                return new ReturnBookPage(store);
            }
            case AddMember -> {
                return new AddMemberPage(store);
            }
            case RemoveMember -> {
                return new RemoveMemberPage(store);
            }
            case AddBook -> {
                return new AddBookPage(store);
            }
            case RemoveBook -> {
                return new RemoveBookPage(store);
            }
            case ShowBooks -> {
                return new ShowBooksPage(store);
            }


        }
    }
}

