package demo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] infoid = new int[3][5];

		infoid[0][0] = 1;
		infoid[0][1] = 1; // getstep1 for id and when id is return set that to compted
		infoid[0][2] = 1;
		infoid[0][3] = 1;
		infoid[0][4] = 0;

		infoid[1][0] = 1;
		infoid[1][1] = 1; // getstep1 for id and when id is return set that to compted
		infoid[1][2] = 0;
		infoid[1][3] = 1;
		infoid[1][4] = 1;

		infoid[2][0] = 1;
		infoid[2][1] = 1; // getstep1 for id and when id is return set that to compted
		infoid[2][2] = 1;
		infoid[2][3] = 1;
		infoid[2][4] = 1;

		data objData = new data();

		for (int i = 0; i < infoid.length; i++) {
			objData.addID(i);

			if (infoid[i][0] == 1) { // here use the function
				objData.step1(i);
			}
			if (infoid[i][1] == 1) {
				objData.step2(i);
			}
			if (infoid[i][2] == 1) {
				objData.step3(i);
			}
			if (infoid[i][3] == 1) {
				objData.step4(i);
			}
			if (infoid[i][4] == 1) {
				objData.step5(i);
			}

		}

		ArrayList<model> temparrayModels = objData.returnEveryIDS();
		System.out.println("List of every ID with the Steps:" + "\n");
		for (model m : temparrayModels) {

			System.out.println("ID number " + m.getId());
			System.out.println("Step1 " + m.getStep1());
			System.out.println("Step2 " + m.getStep2());
			System.out.println("Step3 " + m.getStep3());
			System.out.println("Step4 " + m.getStep4());
			System.out.println("Step5 " + m.getStep5() + "\n");

		}
		temparrayModels = objData.getIdthatisNOTcomplted();
		System.out.println("This is the list of id that are not completed: ");
		for (model m : temparrayModels) {

			System.out.println("Id number is: " + m.getId() + "\n");

		}

	}

}
