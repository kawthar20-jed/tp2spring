


	public class Student {
	    private String firstName;
	    private String lastName;
	    private Integer id; // Change the type of id to Integer

	    public Student(String firstName, String lastName, Integer id) { // Change the type of id to Integer
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.id = id;
	    }


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	 @Override
	    public String toString() {
	        return "Student{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", id=" + id +
	                '}';
	    }

    // Getters and setters
}
