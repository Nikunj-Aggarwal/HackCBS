package model;

public class Feed {
	private String CourseName;
	private String details;
	private String CourseId;
	private String syllabus;
	private String duration;
	private String fee;
	private String place;
	private String weblink;
	private String eligibility;
	private String ImageUrl;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String CourseName) {
		this.CourseName=CourseName ;
	}
	public String getdetails() {
		return details;
	}
	public void setdetails(String details) {
		this.details = details;
	}public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String CourseId) {
		this.CourseId = CourseId;
	}
	public String getfee() {
		return fee;
	}
	public void setfee(String fee) {
		this.fee=fee;
	}
	
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	
	public String getduration() {
		return duration;
	}
	public void setduration(String duration) {
		this.duration = duration;
	}public String getweblink() {
		return weblink;
	}
	public void setweblink(String weblink) {
		this.weblink = weblink;
	}
	public String getplace() {
		return place;
	}
	public void setplace(String place) {
		this.place = place;
	}
	public String geteligibility() {
		return eligibility;
	}
	public void seteligibility(String eligibility) {
		this.eligibility=eligibility;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String ImageUrl) {
		this.ImageUrl=ImageUrl;
	}
	
}