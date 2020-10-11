package Other;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Other {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\_projects\\testSelenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    /*

    == - равно
    != - не равно
    || - или
    && - и
    a += 5  // a = a+5
    a -= 5  // a = a-5
    a *= 5  // a = a*5
    a /= 5  // a = a/5
    a %= 3  //a = a % 3  остаток от деления

        System.out.println(Math.sqrt(9));
        -вычисляем корень квардатный
        System.out.println(Math.pow(9, 3));
        -возведение в степень 9 в 3 степени




                        работа со строками
     */
        String s = "Hello World";
        System.out.println(s.equals("Hello World")); //сравнивет текст
        System.out.println(s.equalsIgnoreCase("hELLO World")); //сравнивает текст в другом регистре выводит true / false
        System.out.println(s.toLowerCase()); // пишет все маленькими буквами нижний регистр
        System.out.println(s.toUpperCase()); // пишет все большими буквами верхний регистр
        System.out.println(s.charAt(1)); // выводит второй символ строки s "e"
        System.out.println(s.indexOf("Wo")); // с какого индекса начинается данный символ в строке выводит true / false
        System.out.println(s.contains("World")); // есть ли в строке строка .. выводит true / false
        System.out.println(s.length()); //выводит длину строки
        System.out.println(s.startsWith("He")); //начинается ли строка s на чтрочку ... выводит true / false
        System.out.println(s.endsWith("ld"));// заканчиваеться строка s на строчку ... выводит true / false

        // используем разделитель строки
        s = "hello,world";
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!"); // выводит первую часть строки до "," потом "!" и вторую часть строки после разделителя ","

        // подставляет в строку новые значения
        String atr = "My name is %s!I'm %d years old";
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(atr, name, age)); // My name is Ivan!I'm 30 years old
        System.out.println(String.format(atr, "Vasya", 10)); // My name is Vasya!I'm 10 years old

        //переобразует строку в число
        String age2 = "30";
        int a = Integer.parseInt(age2);

        // позволяет выделить подстроку с 1-го по 5й индекс из строки или с 7-го до конца
        s = "Hello World";
        System.out.println(s.substring(1, 5));
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, s.length() - 2));

        // обьединение строк
        String s1 = "Hello";
        String s2 = " World";
        String s3 = "!";
        String res;
        res = s1 + s2;
        System.out.println(res);
        res = s1.concat(s2).concat(s3);
        System.out.println(res);

        /*

                        оси xPath

                ancestor - or - self::
                following - sibling::
                preceding - sibling::
                / parent::
                //input[@id='searchInput']/ancestor-or-self::form   возвращает предка и себя
                //input[@id='searchInput']/ancestor::form          возвращает предка данного узла
                //input[@id='searchInput']/following-sibling::*      позволяет вернуть соседей, которые находяться ниже нашего элемента
                //input[@id="searchButton"]/preceding-sibling::input[@id="searchInput"]   возвращает соседей, которые находяться на том же уровне, но выше нашего элемента
                //input[@id="searchButton"]/parent::*  возвращает родителя

                функции xPath
                //nav[@id='p-navigation']/div[@class='body vector-menu-content']/ul[@class='vector-menu-content-list']/li[last()]
                [last()] находит последний среди li
        //a[text()='Wikipedia']     -   [text()] находит по тексту
        //div[contains(@class, 'nourlexpansion')]   -   находим по контексту
        //input[starts-with(@title, "Search Wikipedia for")]    -  находит начало по контексту тайтлу или др
        https: //en.wikipedia.org/wiki/Main_Page
        div[@class ='lang-list-container']//li[3]/a[@title ='English']

        String Error = new String(WebelementError1.getText());
        boolean result = Error.contains("There are problems with some of your input.");
        System.out.println(result);
        WebElement link = driver.findElement(By.linkText("Log in"));  // находит по названию линки
        WebElement link2 = driver.findElement(By.partialLinkText("Contact")); // находит по части названия текста
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.ByClassName("searchButton")).click();
        WebElement webElement = driver.findElement(By.xpath("//a[@class='mw-wiki-logo']"));

        driver.manage().window().setSize(new Dimension(900, 500)); // указываем размер окна
        driver.get("https://www.wikipedia.org/");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back(); // возвращает предидущую страницу. на страницу назад
        driver.navigate().forward(); // возвращает на страницу вперед
        driver.navigate().refresh(); // перезагружает страничку
        System.out.println(driver.getTitle()); // получим тайтл нашей страницы и выведем на экран
        System.out.println(driver.getCurrentUrl());// получение URL странички и выведем на экран
        driver.quit(); // завершает работу браузера

        */
    }
}
