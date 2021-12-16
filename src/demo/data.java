package demo;

import java.util.ArrayList;

public class data {
	ArrayList<model> idInfosArrayList = new ArrayList<model>();
	private model obModel;

	public void addID(int id) {
		this.obModel = new model(id);
		this.idInfosArrayList.add(obModel);

	}

	public void step1(int id) {

		for (model idinfo : this.idInfosArrayList) {
			if (idinfo.getId() == id) {
				int tempIndex = idInfosArrayList.indexOf(idinfo);
				idinfo.setStep1(1);
				idInfosArrayList.set(tempIndex, idinfo);
			}
		}

	}

	public void step2(int id) {
		for (model idinfo : this.idInfosArrayList) {
			if (idinfo.getId() == id) {
				int tempIndex = idInfosArrayList.indexOf(idinfo);
				idinfo.setStep2(1);
				idInfosArrayList.set(tempIndex, idinfo);
			}
		}

	}

	public void step3(int id) {
		for (model idinfo : this.idInfosArrayList) {
			if (idinfo.getId() == id) {
				int tempIndex = idInfosArrayList.indexOf(idinfo);
				idinfo.setStep3(1);
				idInfosArrayList.set(tempIndex, idinfo);
			}
		}

	}

	public void step4(int id) {
		for (model idinfo : this.idInfosArrayList) {
			if (idinfo.getId() == id) {
				int tempIndex = idInfosArrayList.indexOf(idinfo);
				idinfo.setStep4(1);
				idInfosArrayList.set(tempIndex, idinfo);
			}
		}

	}

	public void step5(int id) {
		for (model idinfo : idInfosArrayList) {
			if (idinfo.getId() == id) {
				int tempIndex = idInfosArrayList.indexOf(idinfo);
				idinfo.setStep5(1);
				idInfosArrayList.set(tempIndex, idinfo);
			}
		}

	}

	public ArrayList<model> getIdthatisNOTcomplted() {
		ArrayList<model> idNotcompltedModels = new ArrayList<model>();
		for (model idinfo : idInfosArrayList) {

			if (!(idinfo.getStep1() == 1 && idinfo.getStep2() == 1 && idinfo.getStep3() == 1 && idinfo.getStep4() == 1
					&& idinfo.getStep5() == 1)) {
				idNotcompltedModels.add(idinfo);

			}

		}
		return idNotcompltedModels;

	}

	public ArrayList<model> returnEveryIDS() {
		return idInfosArrayList;
	}

}
