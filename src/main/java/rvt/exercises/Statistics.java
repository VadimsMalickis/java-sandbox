package rvt.exercises;

import rvt.utils.Helper;

public class Statistics {
        private int count;

        private int sum = 0;


        public Statistics() {
            Statistics allStatistics = new Statistics();
            Statistics evenStatistics = new Statistics();
            Statistics oddStatistics = new Statistics();
    
            System.out.println("Enter numbers:");
            int input;
            while ((input = Helper.askForInt()) != -1) {
                allStatistics.addNumber(input);
                if (input % 2 == 0) {
                    evenStatistics.addNumber(input);
                } else {
                    oddStatistics.addNumber(input);
                }
            }
            System.out.println("Sum: " + allStatistics.sum());
            System.out.println("Sum of even numbers: " + evenStatistics.sum());
            System.out.println("Sum of odd numbers: " + oddStatistics.sum());
        }

        public void addNumber(int number) {
            this.count++;
            this.sum += number;
        }

        public int getCount() {
            return this.count;
        }

        public int sum() {
            return this.sum;
        }

        public double average() {
            if (this.sum == 0) {
                return (double) this.sum;
            } 
            return (double) this.sum / this.count;
        }
    }
