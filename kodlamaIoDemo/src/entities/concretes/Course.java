package entities.concretes;

public class Course {
	
	private int courseId;
	private Category category;
	private String name;
	private String detail;
	private String imagePath;
	private int stepNumber;

	private Teacher teacher;

	public Course() {
		super();
	}

	public Course(int courseId, Category category, String name, String detail, String imagePath, Teacher teacher, int stepNumber) {
		super();
		this.courseId = courseId;
		this.category = category;
		this.name = name;
		this.detail = detail;
		this.imagePath = imagePath;
		this.teacher = teacher;
		this.stepNumber = stepNumber;
	}


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(int stepNumber) {
		this.stepNumber = stepNumber;
	}
	

}
