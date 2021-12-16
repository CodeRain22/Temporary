package demo;

public class model {
	private int id;
	private int step1;
	private int step2;
	private int step3;
	private int step4;
	private int step5;

	public model(int id) {
		this.id = id;
		this.step1 = 0;
		this.step2 = 0;
		this.step3 = 0;
		this.step4 = 0;
		this.step5 = 0;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStep1() {
		return step1;
	}

	public void setStep1(int step1) {
		this.step1 = step1;
	}

	public int getStep2() {
		return step2;
	}

	public void setStep2(int step2) {
		this.step2 = step2;
	}

	public int getStep3() {
		return step3;
	}

	public void setStep3(int step3) {
		this.step3 = step3;
	}

	public int getStep4() {
		return step4;
	}

	public void setStep4(int step4) {
		this.step4 = step4;
	}

	public int getStep5() {
		return step5;
	}

	public void setStep5(int step5) {
		this.step5 = step5;
	}

}
