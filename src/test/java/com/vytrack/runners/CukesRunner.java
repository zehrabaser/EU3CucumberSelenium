package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
        @CucumberOptions(
                plugin = {"json:target/cucumber.json",//burada cucumbera bir json file yapmasini soyledik
                        // json is a storage information
                        //bu plugin kismini olusturduktan sonra run yapiyoruz ve ardindan cucumber.json target kisminin
                        // altina geliyor
                        "html:target/default-html-reports",
                        //bu html report almak icin
                        //html report ta maven dan verify yapmaya gerek yok direkt buradan rapor alabiliriz
                        //solda targetin altinda html report bul ve index kismindan sag tiklayip open with
                        //any browser report alindi
                        //bu report bizim icin yeterli ama manager a gostermek icin maven report daha iyi
                        "rerun:target/rerun.txt"},
                //bu rerun i kullanarak fail olan testlerin hangileri olduklarini bulup tekrar execute edecek.

                features = "src/test/resources/features", //where our features are located
                glue = "com/vytrack/step_definitions", //where our step definitions are located
                //dryRun=true, // it will not execute the code ama hatali olan kismi alta yadiracak buda
                // bize zaman kazandiracak cunku zamanin tamamlanmasini beklemeden hatayi gormus olacagiz
                dryRun= false, // it will execute the code normally ama code belirledigimiz sureyi beklemek zorunda
                tags="@wip" //buraya  @login yazip login features tada en bastaki features uzerine  @login
                //yazarsak hepsini yapiyor. yani hepsine ayri ayri yazmaya gerek yok

                //tags="@driver and @VYT-123" mesela @VYT-123 ismiyle olan 2 senaryo var veben sadece birini
                //almak istiyorum o zaman and ile diger annotacion da eklemeliyim @driver gibi

                //tags="@driver or @store_manager" boyle yazarsak icinde @driver veya  @store_manager olan
                //kelimeleri execute edecek

                //tags="@login and not @wip" boyle yazinca hepsini execute yapiyor sadece  @wip yapmiyor
                //tags="@login and not @wip and not ..." bu sekilde devam edebiliriz
        )
public class CukesRunner {
}
