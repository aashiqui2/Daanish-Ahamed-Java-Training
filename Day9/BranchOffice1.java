package tamilnadu.kallakurichi;

import tamilnadu.chennai.BranchOffice;

public class BranchOffice1 extends BranchOffice{
        BranchOffice1(){
            System.out.println("Welcome to Kallakurichi");
        }
        public static void main(String[] args) {
            BranchOffice1 bfo1=new BranchOffice1();
            // bfo1.hike();
            bfo1.wfh();
        }
        void hike(){
            System.out.println("got salary Hike !");
        }
    }


