import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Money money = new Money();
        //int m = money.getMoney();
        //System.out.println(m);

        Worker worker = new Worker();
        Worker worker2 = new Worker();

        //Pensioner pensioner = new Pensioner("Mark", 35, 170, 65, 1.2);
        //System.out.println(pensioner);

        worker.setMinSalary(1000);
        worker.setMaxSalary(2000);
        worker.setAge(45);

        worker2.setMinSalary(500);
        worker2.setMaxSalary(1500);
        worker2.setAge(45);

        //double answer = worker.calculatePension();

        //System.out.println(worker + " твоя пенсия составит $:");
        //System.out.println(answer);

        //List<Person> children = new ArrayList<>();

       //Worker firstChild = new Worker();
        //firstChild.setName("Иван");

        //Worker secondChild = new Worker();
        //secondChild.setName("Дмитрий");

        //children.add(firstChild);
        //children.add(secondChild);

        //worker.setChildren(children);

        //worker.infoAboutChildren();

        //Company oracle = new Company("Oracle");
        //Company google = new Company("Google");

        //List<Company> companyList = new ArrayList<>();
        //companyList.add(oracle);
        //companyList.add(google);

        //worker.setCompanyList(companyList);

        //worker.infoAboutCompany();

        Set<PensionFund> set = new HashSet<>();

        PensionFund pensionFund = new PensionFund("Пенсионный фонд Будва", "27-09-2000", TypeOfFund.STATE);
        set.add(pensionFund);

        PensionFund pensionFundSecond = new PensionFund("Пенсионный фонд Адриатика", "08-08-2010", TypeOfFund.SCAM);
        set.add(pensionFundSecond);

        PensionFund pensionFundThird = new PensionFund("Пенсионный фонд Жабляк", "09-09-2002", TypeOfFund.NOT_STATE);
        set.add(pensionFundThird);

        worker.setAvailablePensionFunds(set);

        System.out.println(worker.calculatePension());

        Set<PensionFund> set2 = new HashSet<>();

        PensionFund pensionFund2 = new PensionFund("Пенсионный фонд Минск", "27-09-2000", TypeOfFund.STATE);
        set2.add(pensionFund2);

        PensionFund pensionFundSecond2 = new PensionFund("Пенсионный фонд Брест", "08-08-2010", TypeOfFund.SCAM);
        set2.add(pensionFundSecond2);

        PensionFund pensionFundThird2 = new PensionFund("Пенсионный фонд Немига", "09-09-2002", TypeOfFund.NOT_STATE);
        set2.add(pensionFundThird2);

        worker2.setAvailablePensionFunds(set2);

        System.out.println(worker2.calculatePension());
    }
}