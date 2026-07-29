package be_study_8.quiz.quiz53;

public class ResponseDTO {
	
	Body body;
	
	Header header;
	
	@Override
	public String toString() {
		return "ResponseDTO [body=" + body + ", header=" + header + "]";
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	
}
