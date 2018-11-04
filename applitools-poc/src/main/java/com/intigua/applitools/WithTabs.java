package com.intigua.applitools;

/**
 * Created by guy on 30/05/2016.
 */
public abstract class WithTabs {
    protected TabMenu tabMenu;
    public WithTabs(){
        tabMenu = new TabMenu();
    }
    public void login(String user, String pass){
        // FIXME: 6/18/2016 cannot login from servernavigator since should already be logged in at this point
    }
    public void logout(){
        tabMenu.logout();
    }
    public WithTabs goTo(TabMenuType type){
        return tabMenu.goTo(type);
    }

}
