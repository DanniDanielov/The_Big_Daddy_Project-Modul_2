package com.company;

public class WorkDistribution {
    int workhours;
    public void clientDistribution(int workHours){
        // тука вече можеш да задаваш на всеки работник по кой проект да работи и да му задаваш време
        // на забравяй да направиш проверки за датите, т.е. дали е преди датата на изтичане или със задна дата
        // и всичката информация я записваш в лист
        // този лист ще го показваш в класа CreateWorkerProtocol
        // отбелязвай кое е изпълнено с " - да"
        // гледай да разпределиш в повече методи, за да са по- къси и да съдържат по по-малко код

        this.workhours = workHours;
        workhours+=workHours;
    }
}
