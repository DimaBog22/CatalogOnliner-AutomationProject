package PageObject.Onliner.CatalogPage.HomePage.NavigationMenuEnums.Catalog.Electronics.PhonesAndAccessories;

public enum PhonesAndAccessoriesLinkEnum {

    MOBILE_PHONES("//*[@href='https://catalog.onliner.by/mobile']"),
    HEADPHONES("//*[@href='https://catalog.onliner.by/headphones']"),
    FITNESS_BRACELETS("//*[@href='https://catalog.onliner.by/smartwatch?sw_type%5B0%5D=bracelet&sw_type%5Boperation%5D=union']"),
    SMART_WATCHES("//a[@href='https://catalog.onliner.by/smartwatch?sw_type%5B0%5D=watch&sw_type%5B1%5D=smartphonewatch&sw_type%5B2%5D=fitwatch&sw_type%5B3%5D=hybridsmartwatch&sw_type%5Boperation%5D=union&sw_kid=0']"),
    PORTABLE_CHARGERS("//*[@href='https://catalog.onliner.by/portablecharger']"),
    MEMORY_CARDS("//*[@href='https://catalog.onliner.by/memcards?typememcards%5B0%5D=microsd&typememcards%5B1%5D=microsdxc&typememcards%5B2%5D=microsdhc&typememcards%5Boperation%5D=union']");

    String link;

    PhonesAndAccessoriesLinkEnum(String link) {
        this.link = link;
    }

    public String getLinkText() {
        return link;
    }

}
