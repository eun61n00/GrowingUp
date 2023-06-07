package ch16.scheduler;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담원 할당 방식을 선택하세요.");
        System.out.println("R: Round Robin");
        System.out.println("L: Least Job");
        System.out.println("P: Priority Allocation");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        }
        else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        }
        else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }

}
