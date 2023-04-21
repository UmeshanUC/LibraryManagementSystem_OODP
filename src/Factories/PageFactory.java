package Factories;

import Enums.Pages;
import UIs.Cli.HomePage;
import UIs.Page;


public class PageFactory {
    public static Page Create(Pages page){
        switch (page) {
            case Home -> {
                return new HomePage();
            }
            case MemberManage -> {
            }
            case BookManage -> {
            }
            case LendBook -> {
            }
            case ReturnBook -> {
            }
        }
        return null;
    }
}

