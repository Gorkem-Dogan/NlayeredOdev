package entities;

public class Category {
	private String courseCategory;
	public Category(String courseCategory) 
	
	{
		this.courseCategory=courseCategory;
	}
	public Category() 
	{
		
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

}
