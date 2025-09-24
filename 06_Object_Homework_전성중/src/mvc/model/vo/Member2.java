package mvc.model.vo;

//해당 패키지에 Member가 있어서 Member2로 지정
public class Member2 {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String citizenNo;
	private double height;
	
	public Member2() {
		
	}
	
	public Member2(String memberId, String memberPwd, String memberName, String citizenNo, double height) {
		this.memberId= memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.citizenNo = citizenNo;
		this.height = height; 
	}	
	
	public String information() {
		String str = "아이디 = " + memberId + ", 비밀번호 = " + memberPwd + ", 이름 = " + memberName + ", 주민번호 = " + citizenNo +
				", 키 = " + height; 
		return str; 
	}
		
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getCitizenNo() {
		return citizenNo;
	}
	public void setCitizenNo(String citizenNo) {
		this.citizenNo = citizenNo;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	} 

}
