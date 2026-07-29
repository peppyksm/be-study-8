package be_study_8.quiz.quiz53;

public class Header {

	String resultMsg;
	int resultCode;
	@Override
	public String toString() {
		return "Header [resultMsg=" + resultMsg + ", resultCode=" + resultCode + "]";
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	
}
